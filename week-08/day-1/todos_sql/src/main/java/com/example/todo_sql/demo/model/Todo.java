package com.example.todo_sql.demo.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Todo {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String title;
   private String description;
   private Boolean urgent = false;
   private Boolean done  = false;


   //Add a Todo class with the fields(id: long, title: String, urgent: boolean(default false), done: boolean(default false))
}
