package com.todo_database.demo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Todo {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   @NonNull
   private String title;
   private Boolean urgent;
   private Boolean done;




    //Add a Todo class with the fields(id: long, title: String, urgent: boolean(default false), done: boolean(default false))
}
