package org.example.DesignPatern.ExoDesignPatern.ExoDecorator;

public class AddPrefixDecorator extends TextDecorator{


    public AddPrefixDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return "Ceci est avant le texte et "+super.getText();
    }
}
