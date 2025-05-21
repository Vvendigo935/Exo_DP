package org.example.DesignPatern.ExoDesignPatern.ExoNotif;

import org.example.DesignPatern.ExoDesignPatern.ExoNotif.Notifier;
import org.example.DesignPatern.ExoDesignPatern.ExoNotif.EventManager;
import org.example.DesignPatern.ExoDesignPatern.ExoNotif.SubjectEvent;
import org.example.DesignPatern.behavioral.observer.Observer;

public class Main {
    public static void main(String[] args) {

        SubjectEvent subjectEvent = new SubjectEvent();

        Notifier observer1 = new EventManager("observer one");
        Notifier observer2 = new EventManager("observer two");
        Notifier observer3 = new EventManager("observer three");

        subjectEvent.addObserver((Observer) observer1);


    }
}
