package org.example.DesignPatern.ExoDesignPatern.CorrectionEventObserver;

public class MailObserver implements Observer{
    @Override
    public void onNotify(String event) {
        System.out.println("envoie d'un mail car il y'a eu un nouveau event : "+event);
    }
}
