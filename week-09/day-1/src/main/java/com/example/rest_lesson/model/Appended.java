package com.example.rest_lesson.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Appended {
    private String appended;

    public Appended(String appendable) {
        this.appended = appendable + "a";
    }

}
