package com.company;

public class Osoba {

    private Mediator mediator;
    private String id;
    public Mediator getMediator() {
        return mediator;
    }
    Osoba(String id) {
        this.id = id;
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public String getImie() {
        return id;
    }
    public String getId() {
        return id;
    }
    public void odbierz(String message){
        System.out.println("("+id+ " odebral wiadomosc: " + message+")");
    }
    public void sendMessage(String id, String message) {
        System.out.println(this.id + " do " +id+ ": " +message);
        mediator.sendMessage(id, message);
    }
    public void sendMessageToAll(String message) {
        System.out.println(this.id + " do wszystkich: " + message);
        mediator.sendMessageToAll(message);
    }
}
