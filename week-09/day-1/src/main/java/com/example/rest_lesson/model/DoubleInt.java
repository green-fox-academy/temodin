package com.example.rest_lesson.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DoubleInt {
    private Integer received;
    private Integer result;

    public DoubleInt(Integer received) {
        this.received = received;
        this.result = getResult();
    }

    public Integer getResult () {
        return received *2;
    }

}
