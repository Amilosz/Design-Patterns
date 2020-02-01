package com.company;

public class StanWnioskuZamkniety implements StanWniosku{
    @Override
    public void goNext(Wniosek wniosek) {
        System.out.println("========wniosek zamkniety========");
    }
}
