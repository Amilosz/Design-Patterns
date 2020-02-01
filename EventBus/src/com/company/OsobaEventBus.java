package com.company;

import java.util.*;

public class OsobaEventBus {
    List <Osoba> odbiorcy = new LinkedList<Osoba>();

    public void addSubscriber(Osoba o){
        odbiorcy.add(o);
    }
    public void notifyAll(Event e){
        for (Osoba o: odbiorcy) {
            o.call(e);
        }
    }
}
