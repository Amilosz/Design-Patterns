package com.company;

public class StanWnioskuOdrzucone implements StanWniosku {
    @Override
    public void goNext(Wniosek wniosek) {
        System.out.println("(minelo 6 minut)");
        wniosek.setCurrentState(new StanWnioskuZamkniety());
        wniosek.sprawdz(wniosek, wniosek.numer_urzedu);
    }
}
