package com.company;

public class Handler {
    Handler next;
    public void modify(String category, String napis){
        next.modify(category, napis);
    }
    public void setNext(Handler next) {
        this.next = next;
    }
}
