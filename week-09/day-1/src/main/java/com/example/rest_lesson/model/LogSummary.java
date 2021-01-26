package com.example.rest_lesson.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

public class LogSummary {
    private List<Log> logList= new ArrayList<>();
    private Integer logCount;

    public LogSummary(List<Log> logList, Integer logCount) {
        this.logList = logList;
        this.logCount = logCount;
    }
}
