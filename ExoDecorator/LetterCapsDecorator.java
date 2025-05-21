package org.example.DesignPatern.ExoDesignPatern.ExoDecorator;
// mise en majuscule decorator
public class LetterCapsDecorator extends TextDecorator {
    public LetterCapsDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return super.getText().toUpperCase();
    }
}
