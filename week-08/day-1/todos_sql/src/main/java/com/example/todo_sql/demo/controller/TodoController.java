package com.example.todo_sql.demo.controller;


import com.example.todo_sql.demo.model.Todo;
import com.example.todo_sql.demo.repository.TodoRepository;
import com.example.todo_sql.demo.service.TodoService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class TodoController {

    TodoRepository todoRepository;
    TodoService todoService;

    @Autowired
    public TodoController(TodoRepository todoRepository, TodoService todoService) {
        this.todoRepository = todoRepository;
        this.todoService = todoService;
    }


    //Create a new controller called TodoController which maps to /todo
    //Add a public String list() method which maps to / and /list in the controller, which returns with "This is my first Todo" string. Use the @ResponseBody annotation.

    @GetMapping("/newtodo")
    public String toDo() {
        return "newtodo";
    }

    @PostMapping("/add-todo")
    public String addToDo(String title, String description, Boolean urgent, Boolean done) {
        urgent = urgent == null? false:true;
        done = done == null? false:true;
        todoRepository.save(Todo.builder().title(title).description(description).urgent(urgent).done(done).build());
        return "redirect:/";
    }


    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean done) {
        List<Todo> todos = new ArrayList<>();

        if (done == null) {
            todos = (List<Todo>) todoRepository.findAll();
        } else {
            todos = ((List<Todo>) todoRepository.findAll()).stream().filter(t -> t.getDone() == done).collect(Collectors.toList());
        }
        model.addAttribute("todos", todos);
        return "todolist";
    }

    @PostMapping("/{id}/delete")
    public String deleteToDo(@PathVariable long id) {
        todoRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String getEditToDo(@PathVariable long id, Model model) {
        Optional<Todo> optionalTodo = todoRepository.findById(id);
        Todo todo;
        if (optionalTodo.isPresent()) {
            todo = optionalTodo.get();
        } else {
            return "redirect:/";
        }
        model.addAttribute("id", todo.getId());
        model.addAttribute("title", todo.getTitle());
        model.addAttribute("description", todo.getDescription());
        model.addAttribute("urgent", todo.getUrgent());
        model.addAttribute("done", todo.getDone());
        return "edittodo";
    }

    @PostMapping("/{id}/edit-todo")
    public String postEditToDo(@PathVariable long id, String title, String description, Boolean urgent, Boolean done) {
        urgent = urgent == null? false:true;
        done = done == null? false:true;
        todoRepository.save(Todo.builder().id(id).title(title).description(description).urgent(urgent).done(done).build());
        return "redirect:/";
    }

    @PostMapping("/search-todo")
    public String searchTodo (String field, String keyword, Model model) {
        //todoService.setSearchedTodos(todoService.searchTodos(field,keyword));
        //return "search";
        return "redirect:/search?field=" + field + "&keyword=" + keyword;
    }

    @GetMapping("/search")
    public String list(Model model, @RequestParam String field, @RequestParam String keyword) {
        List<Todo> todos = new ArrayList<>();
        model.addAttribute("todos", todoService.searchTodos(field,keyword));
        return "todolist";
    }

}
