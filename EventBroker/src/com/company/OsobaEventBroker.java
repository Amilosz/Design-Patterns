package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OsobaEventBroker {
    Map<EventType, List<Osoba> > odbiorcy = new HashMap<>();
    Map<EventType, List<Osoba> > dostawcy = new HashMap<>();

    public void addPublisher(Osoba o, EventType et){
        if (dostawcy.get(et) == null) {
            dostawcy.put(et, new ArrayList<>());
        }
        dostawcy.get(et).add(o);
    }

    public void addSubscriber(Osoba o, EventType et){
        if (odbiorcy.get(et) == null) {
            odbiorcy.put(et, new ArrayList<>());
        }
        odbiorcy.get(et).add(o);
    }

    public void notifyAll(Event e){
        for (Osoba o: odbiorcy.get(e.getType())) {
            o.call(e);
        }
    }
}
