package com.todo_database.demo.repository;

import com.todo_database.demo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
