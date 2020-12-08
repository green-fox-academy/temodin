package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar () {
        name = "bass guitar";
        numberOfStrings = 4;
    }
    public BassGuitar (int numberOfStrings) {
        name = "bass guitar";
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String sound() {
       return "Duum-duum-duum";
    }
}
