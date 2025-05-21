package org.example.DesignPatern.ExoDesignPatern.ExoAnimaux;

public class Cats implements Animal {

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public void actionCat() {
        System.out.println("JE CHIE SUR LA MOQUETTE ET JE FAIT MES GRIFFES SUR LE CANAP");
    }
}