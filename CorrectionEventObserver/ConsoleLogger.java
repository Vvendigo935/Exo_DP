package org.example.DesignPatern.ExoDesignPatern.CorrectionEventObserver;


public class ConsoleLogger implements Observer {
    @Override
    public void onNotify(String event) {
        System.out.println("Console Logger à recu : "+event+" !!!");
    }
}
