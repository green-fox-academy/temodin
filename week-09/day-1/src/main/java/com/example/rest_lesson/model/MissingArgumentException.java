package com.example.rest_lesson.model;

import java.util.List;

public class MissingArgumentException extends Exception{


    public MissingArgumentException(List<String> missingField) {
        super("The missing fields are: " + String.join(",", missingField));
    }
}
