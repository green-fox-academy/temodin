package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private Boolean active;
    private String password;
    private String roles;
    @Column(name = "user_name")
    private String userName;

}
