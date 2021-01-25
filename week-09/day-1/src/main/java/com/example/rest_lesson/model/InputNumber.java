package com.example.rest_lesson.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class InputNumber {
    private Integer until;

    public InputNumber(Integer until) {
        this.until = until;
    }
}
