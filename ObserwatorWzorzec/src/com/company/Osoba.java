package com.company;


import java.text.MessageFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Osoba {
    List<Osoba> childrens = new LinkedList<Osoba>();
    List<Osoba> parents = new LinkedList<Osoba>();
    Osoba wife;

    String name;
    String surname;
    Date dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Osoba(String name, String surname, Date date) {
        setName(name);
        setSurname(surname);
        setDateOfBirth(date);
    }

    public void addParents(Osoba parent) {
        parents.add(parent);
    }

    public void addChildren(Osoba children) {
        childrens.add(children);
    }

    public Osoba getWife() {
        return wife;
    }

    public void setWife(Osoba wife) {
        this.wife = wife;
    }

    public void newChildren(Osoba children) {
        childrens.add(children);
        notifyObservers("new children");
    }

    public void changeNameAndSurname(String name, String surname) {
        this.name = name;
        this.surname = surname;
        notifyObservers("new name and surname");
    }

    public void changeData(Date newData) {
        this.dateOfBirth = newData;
        notifyObservers("new data of birth");
    }

    public void updateNewSibling() {
        System.out.println(MessageFormat.format("{0} {1}: mam nowe rodzeństwo!", this.getName(), this.getSurname()));
    }

    public void updateNewName() {
        System.out.println(MessageFormat.format("{0} {1}: nowe imie i nawisko!", this.getName(), this.getSurname()));
    }

    public void updateNewDate() {
        System.out.println(MessageFormat.format("{0} {1}: nowa data!", this.getName(), this.getSurname()));
    }

    public void notifyObservers(String eventType) {
        switch (eventType) {
            case "new children":
                for (Osoba children : childrens)
                    children.updateNewSibling();
                break;
            case "new data of birth":
                for (Osoba parent : parents) {
                    parent.updateNewDate();
                }
                break;
            case "new name and surname":
                for (Osoba parent : parents) {
                    parent.updateNewName();
                }
                for (Osoba children : childrens) {
                    children.updateNewName();
                }
                break;
            default:
                System.out.println("Bad eventType");

        }
    }
}
