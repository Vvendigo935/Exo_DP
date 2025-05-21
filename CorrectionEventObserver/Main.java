package org.example.DesignPatern.ExoDesignPatern.CorrectionEventObserver;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        eventManager.addObserver(new ConsoleLogger());
        eventManager.addObserver(new FileLogger());



//        eventManager.notifyObserver("Event 0001 !!!!");
//        eventManager.notifyObserver("Event 0002 !!!!");

        eventManager.createEvent("Pause !!!");

        eventManager.addObserver(new MailObserver());
        eventManager.createEvent("Fin de la corrections !!");

    }
}
