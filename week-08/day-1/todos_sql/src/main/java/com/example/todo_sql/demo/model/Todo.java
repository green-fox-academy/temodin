package com.example.todo_sql.demo.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity

public class Todo {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String title;
   private Boolean urgent = false;
   private Boolean done  = false;

//   public Todo(String title, Boolean urgent, Boolean done) {
//      this.title = title;
//      this.urgent = urgent;
//      this.done = done;
//   }

   public Todo(String title) {
      this.title = title;
   }

   public Todo() {
   }


   //Add a Todo class with the fields(id: long, title: String, urgent: boolean(default false), done: boolean(default false))
}
