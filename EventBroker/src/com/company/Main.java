package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        OsobaEventBroker oeb = new OsobaEventBroker();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, -40);
        Osoba ojciec = new Osoba(1, "Ociec Osoba", cal.getTime(), null, null, null, oeb);
        Osoba matka = new Osoba(2, "Matka Osoba", cal.getTime(),null, null, null, oeb);
        cal.add(Calendar.YEAR, 20);
        Osoba malzonek = new Osoba(3, "Malzonek Osoba", cal.getTime(),null, null, null, oeb);
        Osoba o = new Osoba(4, "Nasz Człowiek", cal.getTime(), ojciec, matka, null, oeb);
        o.getOjciec().getDzieci().add(o);
        o.getMatka().getDzieci().add(o);
        cal.add(Calendar.YEAR, 19);
        Osoba dziecko1 = new Osoba(5, "Dziecko Pierwsze", cal.getTime(),o, malzonek, null, oeb);
        Osoba dziecko2 = new Osoba(6, "Dziecko Drugie", cal.getTime(),o, malzonek, null, oeb);
        o.getDzieci().add(dziecko1);
        o.getDzieci().add(dziecko2);

        oeb.addPublisher(o, EventType.NOWE_DZIECKO);
        oeb.addPublisher(o, EventType.ZMIENIONO_IMIE_NAZWISKO);
        oeb.addPublisher(o, EventType.ZMIENIONO_DATE_URODZIN);

        oeb.addSubscriber(matka, EventType.ZMIENIONO_DATE_URODZIN);
        oeb.addSubscriber(ojciec, EventType.ZMIENIONO_IMIE_NAZWISKO);
        oeb.addSubscriber(matka, EventType.ZMIENIONO_IMIE_NAZWISKO);
        oeb.addSubscriber(dziecko1, EventType.ZMIENIONO_IMIE_NAZWISKO);
        oeb.addSubscriber(dziecko2, EventType.ZMIENIONO_IMIE_NAZWISKO);
        for(Osoba dziecko: o.getDzieci()){
            oeb.addSubscriber(dziecko, EventType.NOWE_DZIECKO);
        }
        o.zmienImieNazwisko("Enedue Likefake");
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(new Date());
        cal2.add(Calendar.YEAR, -21);
        o.zmienDateUrodzin(cal2.getTime());
        Osoba dziecko3 = new Osoba(7, "Dziecko Trzecie", new Date(), o, malzonek, null, oeb);
        o.noweDziecko(dziecko3);


        return;
    }
}
