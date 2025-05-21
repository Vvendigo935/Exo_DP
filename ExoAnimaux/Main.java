package org.example.DesignPatern.ExoDesignPatern.ExoAnimaux;

public class Main {
    public static void main(String[] args) {

       AnimalFactory catFactory = new CatFactory();
        AnimalFactory dogFactory = new DogFactory();
        AnimalFactory foxFactory = new FoxFactory();

        Animal fox1 = foxFactory.createAnimal();
        Animal cat1 = catFactory.createAnimal();
        Animal dog1 = dogFactory.createAnimal();

        dog1.sound();
        cat1.sound();
        fox1.sound();


    }
}
