package com.example.rest_lesson.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private Timestamp createdAt;
    private String endpoint;
    private String data;

    public Log(Timestamp createdAt, String endpoint, String data) {
        this.createdAt = createdAt;
        this.endpoint = endpoint;
        this.data = data;
    }
}
