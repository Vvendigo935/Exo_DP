package org.example.DesignPatern.ExoDesignPatern.ExoDecorator;

public class Main {
    public static void main(String[] args) {

        // partie 1 de l'exo

        Text text1 = new BaseText();
        System.out.println(text1.getText());

        Text minusText = new LetterMinusDecorator(text1);
        System.out.println(minusText.getText());

        Text captext = new LetterCapsDecorator(minusText);
        System.out.println(captext.getText());

        // partie 2 de l'exo

        Text addedPrefixText = new AddPrefixDecorator(minusText);
        System.out.println(addedPrefixText.getText());


    }



}
