package com.todo_database.demo.controller;

import com.todo_database.demo.model.Todo;
import com.todo_database.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController {

    TodoRepository todoRepository;

    @Autowired
    public TodoController (TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    //Create a new controller called TodoController which maps to /todo
    //Add a public String list() method which maps to / and /list in the controller, which returns with "This is my first Todo" string. Use the @ResponseBody annotation.

    @GetMapping("/todo")
    public String toDo() {
        return "todo";
    }

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        List<Todo> todos = (List<Todo>) todoRepository.findAll();
        model.addAttribute("todos",todos);
        return "todolist";
    }


}
