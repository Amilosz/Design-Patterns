package com.company;

import java.util.HashMap;
import java.util.Map;

public class ClassRoomMediator extends Mediator {
    private Map<String, Osoba> classroom = new HashMap<String, Osoba>();
    Osoba prowadzacy;
    public void setProwadzacy(Osoba prowadzacy)
    {
        this.prowadzacy=prowadzacy;
    }

    public void addOsoba(Osoba o) {
        o.setMediator(this);
        classroom.put(o.getId(), o);
    }
    @Override
    public void sendMessage(String id, String message) {
        classroom.get(id).odbierz(message);
    }
    @Override
    public void sendMessageToAll(String message){
        for (Map.Entry<String, Osoba> entry : classroom.entrySet()) {
            entry.getValue().odbierz(message);
        }
    }
    public void sendMessageToProwadzacy(String message)
    {
        prowadzacy.odbierz(message);
    }
}
