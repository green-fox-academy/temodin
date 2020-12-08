package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument{


   public ElectricGuitar (int numberOfStrings) {
       this.name = "electric guitar";
       this.numberOfStrings = numberOfStrings;

   }

   public ElectricGuitar () {
       this.name = "electric guitar";
       this.numberOfStrings = 6;
   }

    @Override
    public String sound() {
       return "Twang";


    }
}
