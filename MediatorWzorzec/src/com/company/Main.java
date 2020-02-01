package com.company;

public class Main {

    public static void main(String[] args) {
	Osoba artur = new UczenOsoba("Artur");
	Osoba pawel = new UczenOsoba("Pawel");
	Osoba nauczyciel = new ProwadzacyOsoba("Nauczyciel Jan");

	Mediator mediatorKlasowy = new ClassRoomMediator();
	((ClassRoomMediator) mediatorKlasowy).setProwadzacy(nauczyciel);
	((ClassRoomMediator) mediatorKlasowy).addOsoba(artur);
	((ClassRoomMediator) mediatorKlasowy).addOsoba(pawel);

	artur.setMediator(mediatorKlasowy);
	pawel.setMediator(mediatorKlasowy);
	nauczyciel.setMediator(mediatorKlasowy);

	artur.sendMessage("Pawel", "Czesc Pawel!");

	nauczyciel.sendMessageToAll("Jutro kolokwium!");
	((UczenOsoba) artur).sendMessageToProwadzacy("Jakie beda pytania?");
    }
}
