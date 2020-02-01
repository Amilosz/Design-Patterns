package com.company;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Osoba {
    private int id;
    private Osoba ojciec;
    private Osoba matka;

    private List<Osoba> dzieci;

    private OsobaEventBus eb;

    private String imieNazwisko;
    private Date dataUr;
    String typ_eventu;

    public void setTyp_eventu(String typ_eventu) {
        this.typ_eventu = typ_eventu;
    }

    public Osoba(int id, String imieNazwisko, Date dataUr, Osoba ojciec, Osoba matka, List<Osoba> dzieci, OsobaEventBus eb) {
        this.ojciec = ojciec;
        this.matka = matka;
        this.dzieci = new ArrayList<>();
        if (dzieci != null) {
            this.dzieci.addAll(dzieci);
        }
        this.eb = eb;
        this.imieNazwisko = imieNazwisko;
        this.dataUr = dataUr;
    }

    public Osoba getOjciec() {
        return ojciec;
    }

    public void setOjciec(Osoba ojciec) {
        this.ojciec = ojciec;
    }

    public Osoba getMatka() {
        return matka;
    }

    public void setMatka(Osoba matka) {
        this.matka = matka;
    }

    public List<Osoba> getDzieci() {
        return dzieci;
    }

    public void setDzieci(List<Osoba> dzieci) {
        this.dzieci = dzieci;
    }

    public void call(Event e) {
        if (e.getType().toString() == typ_eventu) {
                System.out.println(MessageFormat.format("{0}: Obecnie {1} nazywa się {2}", this.imieNazwisko,
                        e.getStareDane().imieNazwisko, e.getNoweDane().imieNazwisko));
        }
    }

    public void fire(Event e) {
        eb.notifyAll(e);
    }

    public void zmienImieNazwisko(String imieNazwisko) {
        Event e = new Event();
        e.setType(EventType.ZMIENIONO_IMIE_NAZWISKO);
        DaneOsoby stare = new DaneOsoby();
        stare.imieNazwisko = this.imieNazwisko;
        e.setStareDane(stare);
        DaneOsoby nowe = new DaneOsoby();
        nowe.imieNazwisko = imieNazwisko;
        e.setNoweDane(nowe);
        this.imieNazwisko = imieNazwisko;
        fire(e);
    }

    public void zmienDateUrodzin(Date dataUr) {
        Event e = new Event();
        e.setType(EventType.ZMIENIONO_DATE_URODZIN);
        DaneOsoby stare = new DaneOsoby();
        stare.dataUr = this.dataUr;
        e.setStareDane(stare);
        DaneOsoby nowe = new DaneOsoby();
        nowe.dataUr = dataUr;
        e.setNoweDane(nowe);
        this.dataUr = dataUr;
        fire(e);
    }

    public void noweDziecko(Osoba o) {
        Event e = new Event();
        e.setType(EventType.NOWE_DZIECKO);
        DaneOsoby nowe = new DaneOsoby();
        nowe.dziecko = new DaneOsoby();
        nowe.dziecko.imieNazwisko = o.imieNazwisko;
        e.setNoweDane(nowe);
        this.getDzieci().add(o);
        fire(e);
    }
}
