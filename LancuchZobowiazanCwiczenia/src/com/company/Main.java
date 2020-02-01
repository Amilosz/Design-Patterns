package com.company;

public class Main {

    public static void main(String[] args) {
	Handler handlerRoot = new Handler();
	Handler handler1 = new HandlerSpam();
	Handler handler2 = new HandlerWazne();
	Handler handler3 = new HandlerInne();
	String napis = "Ala ma kota";
	handlerRoot.setNext(handler1);
	handler1.setNext(handler2);
	handler2.setNext(handler3);

	handlerRoot.modify("spam", napis);
    }
}
