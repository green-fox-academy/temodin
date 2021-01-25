package com.example.rest_lesson.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Welcome {
    @JsonProperty(value= "welcome_message")
    private String welcomeMessage;

    public Welcome(String name, String title) {
        this.welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}
