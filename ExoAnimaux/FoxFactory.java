package org.example.DesignPatern.ExoDesignPatern.ExoAnimaux;

public class FoxFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Fox();
    }

}
