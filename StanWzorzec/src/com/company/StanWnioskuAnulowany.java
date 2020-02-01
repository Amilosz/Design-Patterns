package com.company;

public class StanWnioskuAnulowany implements StanWniosku {
    @Override
    public void goNext(Wniosek wniosek) {
        System.out.println("(minelo 4 minuty)");
        wniosek.setCurrentState(new StanWnioskuZamkniety());
        wniosek.sprawdz(wniosek, wniosek.numer_urzedu);

    }
}
