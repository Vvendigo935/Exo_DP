package org.example.DesignPatern.ExoDesignPatern.ExoAnimaux;

public class CatFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cats();
    }
}
