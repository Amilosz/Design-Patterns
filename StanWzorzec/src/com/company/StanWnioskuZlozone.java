package com.company;

public class StanWnioskuZlozone implements StanWniosku {
    @Override
    public void goNext(Wniosek wniosek) {
        wniosek.setCurrentState(new StanWnioskuPrzyjete());
        System.out.println("--minela 1 minuta");
        System.out.println("Stan wniosku: przyjety");
        wniosek.sprawdz(wniosek, wniosek.numer_urzedu);
    }
}
