package com.company;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Random;

public class Wniosek {
    private StanWniosku currentState;
    Date data_wniosku;
    String nazwisko;
    Integer numer_urzedu;

    public Wniosek(Date data_wniosku, String nazwisko) {
        Random generator = new Random();
        this.data_wniosku = data_wniosku;
        this.nazwisko = nazwisko;
        this.numer_urzedu=generator.nextInt(2);
        System.out.println("###########Zlozono nowy wniosek###########");
        System.out.println(MessageFormat.format("=={0}==={1}==={2}==", this.nazwisko, this.data_wniosku, this.numer_urzedu));
    }
    public void zlozWniosek(){
        this.setCurrentState(new StanWnioskuZlozone());
        System.out.println("Stan wniosku: zlozony.");
        sprawdz(this, this.numer_urzedu);
    }

    public void changeDate(Date date) {
        this.data_wniosku = date;
    }

    public void changeNrUrzedu(Integer urzad) {
        this.numer_urzedu = urzad;
    }

    public void setCurrentState(StanWniosku state) {
        this.currentState = state;
    }

    public void sprawdz(Wniosek wniosek, Integer urzad) {
        currentState.goNext(this);
        //changeDate();
    }
}
