package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, -40);
        Osoba osoba = new Osoba("Jan", "Nowak", cal.getTime());
        Osoba father = new Osoba("Fathet Janusz", "Nowak", null);
        Osoba mother = new Osoba("Mother Joanna", "Nowak", null);
        Osoba wife = new Osoba("Wife Natalia", "Nowak", null);
        Osoba doughter = new Osoba("Sister Anna", "Nowak", null);
        Osoba son = new Osoba("Brother Tomek", "Nowak", null);
        Osoba newKid = new Osoba("New Kid Ben", "Nowak", null);

        osoba.addParents(father);
        osoba.addParents(mother);
        osoba.addChildren(son);
        osoba.addChildren(doughter);
        osoba.setWife(wife);
        System.out.println("==================New Name==================");
        osoba.changeNameAndSurname("Jan", "Listonosz");
        System.out.println("==================New Date==================");
        osoba.changeData(cal.getTime());
        System.out.println("==================New Kid==================");
        osoba.newChildren(newKid);

    }
}
