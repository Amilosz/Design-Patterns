package com.company;

public class StanWnioskuZaakceptowane implements StanWniosku {
    @Override
    public void goNext(Wniosek wniosek) {
        System.out.println("(minelo 5 minut)");
        wniosek.setCurrentState(new StanWnioskuZamkniety());
        wniosek.sprawdz(wniosek, wniosek.numer_urzedu);
    }
}
