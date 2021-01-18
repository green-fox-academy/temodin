package com.example.todo_sql.demo.repository;


import com.example.todo_sql.demo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
