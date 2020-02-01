package com.company;

public class UczenOsoba extends Osoba{

    public UczenOsoba(String id){
        super(id);
    }
    public void sendMessageToProwadzacy(String message) {
        System.out.println(this.getId() + " do prowadzacego " + message);
        this.getMediator().sendMessageToProwadzacy(message);
    }


}
