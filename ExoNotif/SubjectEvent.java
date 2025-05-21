package org.example.DesignPatern.ExoDesignPatern.ExoNotif;

import org.example.DesignPatern.behavioral.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectEvent {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Notifier observer){
        this.observers.add((Observer) observer);
    }

    public void removeObserver(Notifier observer){
        this.observers.remove(observer);
    }

    public void notifObserver(String message){
        for (Notifier observer : observers){
            observer.notification(message);
        }
    }
}
