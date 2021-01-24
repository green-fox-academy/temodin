package com.example.todo_sql.demo.service;

import com.example.todo_sql.demo.model.Todo;
import com.example.todo_sql.demo.repository.TodoRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@Service
public class TodoService {
    List<Todo> todos = new ArrayList<>();
    List<Todo> searchedTodos = new ArrayList<>();
    TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getTodos() {
        return (List<Todo>) todoRepository.findAll();
    }

    public List<Todo> searchTodos(String field, String keyword) {
        List<Todo> todos = new ArrayList<>();
        if (field.equals("title")) {
            todos = (List<Todo>) todoRepository.findAllByTitle(keyword);
        } else todos = (List<Todo>) todoRepository.findAllByDescription(keyword);
        return todos;
    }
}
