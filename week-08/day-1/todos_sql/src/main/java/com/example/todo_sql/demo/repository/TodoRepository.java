package com.example.todo_sql.demo.repository;


import com.example.todo_sql.demo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
List<Todo> findAllByTitle(String title);
List<Todo> findAllByDescription(String description);
}
