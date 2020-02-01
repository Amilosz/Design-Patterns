package com.company;

public abstract class Mediator {
    public abstract void sendMessage(String id, String message);
    public abstract void sendMessageToAll(String message);
    public abstract void sendMessageToProwadzacy(String message);
}
