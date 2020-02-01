package com.company;

public class StanWnioskuPrzyjete implements StanWniosku{
    @Override
    public void goNext(Wniosek wniosek) {
        if (wniosek.numer_urzedu == 1)
        {
            if (wniosek.nazwisko=="MiloszSpolgloski")
            {
                wniosek.setCurrentState(new StanWnioskuOdrzucone());
                System.out.println("Stan wniosku: odrzucone");
                wniosek.sprawdz(wniosek, wniosek.numer_urzedu);
            }
            else if (wniosek.nazwisko=="MiloszSamogloski")
            {
                wniosek.setCurrentState(new StanWnioskuAnulowany());
                System.out.println("Stan wniosku: anulowany");
                wniosek.sprawdz(wniosek, wniosek.numer_urzedu);
            }
            else
            {
                wniosek.setCurrentState(new StanWnioskuZaakceptowane());
                System.out.println("(minely 3 minuty)");
                System.out.println("Stan wniosku: zaakcpetowany");
                wniosek.sprawdz(wniosek, wniosek.numer_urzedu);
            }
        }
        else{
            wniosek.setCurrentState(new StanWnioskuPrzekierowane());
            System.out.println("Stan wniosku: przekierowano");
            wniosek.sprawdz(wniosek, wniosek.numer_urzedu);
        }

    }
}
