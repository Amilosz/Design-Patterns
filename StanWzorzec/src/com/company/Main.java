package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        Wniosek wniosek1 = new Wniosek(cal.getTime(), "Milosz");
        wniosek1.zlozWniosek();


        Wniosek wniosek2 = new Wniosek(cal.getTime(), "MiloszSamogloski");
        wniosek2.zlozWniosek();

        Wniosek wniosek3 = new Wniosek(cal.getTime(), "MiloszSpolgloski");
        wniosek3.zlozWniosek();


    }
}
