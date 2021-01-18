package com.example.todo_sql.demo.controller;


import com.example.todo_sql.demo.model.Todo;
import com.example.todo_sql.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TodoController {

    TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    //Create a new controller called TodoController which maps to /todo
    //Add a public String list() method which maps to / and /list in the controller, which returns with "This is my first Todo" string. Use the @ResponseBody annotation.

    @GetMapping("/newtodo")
    public String toDo() {
        return "newtodo";
    }

    @PostMapping("/add-todo")
    public String addToDo(String title) {
        todoRepository.save(new Todo(title));
        return "redirect:/";
    }


    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean done) {
        List<Todo> todos = new ArrayList<>();

        if (done == null) {todos = (List<Todo>) todoRepository.findAll();}
        else {
            todos = ((List<Todo>)todoRepository.findAll()).stream().filter(t -> t.getDone() == done).collect(Collectors.toList());
        }
        model.addAttribute("todos", todos);
        return "todolist";
    }


}
