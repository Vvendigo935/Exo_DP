package org.example.DesignPatern.ExoDesignPatern.ExoNotif;

public class EventManager implements Notifier{

    private String name;

    public EventManager(String name){
        this.name = name;
    }


    @Override
    public void notification(String notif) {
        System.out.println();
    }
}
