package org.example.DesignPatern.ExoDesignPatern.ExoDecorator;

public class LetterMinusDecorator extends TextDecorator{


    public LetterMinusDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return super.getText().toLowerCase();
    }
}
