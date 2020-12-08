package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{

    public Violin () {
        name = "violin";
        numberOfStrings = 4;
    }
    public Violin (int numberOfStrings) {
        name = "violin";
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public String sound() {
        return "Screech";
    }
}
