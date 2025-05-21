package org.example.DesignPatern.ExoDesignPatern.ExoAnimaux;

public class DogFactory extends AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Dogs();
    }
}
