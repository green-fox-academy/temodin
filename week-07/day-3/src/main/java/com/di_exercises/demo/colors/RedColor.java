package com.di_exercises.demo.colors;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

    @Override
    public String printColor() {
        return  "Printing red...";
    }
}