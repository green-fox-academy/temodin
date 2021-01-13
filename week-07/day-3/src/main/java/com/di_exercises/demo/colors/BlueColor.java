package com.di_exercises.demo.colors;

import org.springframework.stereotype.Service;



public class BlueColor implements MyColor{
    @Override
    public String printColor() {
        return "Printing blue...";
    }
}
