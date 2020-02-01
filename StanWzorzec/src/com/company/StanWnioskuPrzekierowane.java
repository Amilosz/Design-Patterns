package com.company;

import java.util.Random;

public class StanWnioskuPrzekierowane implements StanWniosku {
    @Override
    public void goNext(Wniosek wniosek) {
        wniosek.changeNrUrzedu(1);
        wniosek.setCurrentState(new StanWnioskuPrzyjete());
        wniosek.sprawdz(wniosek, wniosek.numer_urzedu);
    }
}
