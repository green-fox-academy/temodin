package com.example.todo_sql.demo;

import com.example.todo_sql.demo.model.Todo;
import com.example.todo_sql.demo.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    TodoRepository todoRepository;
    public DemoApplication (TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        todoRepository.save(new Todo("learn ORM",false,true));
//        todoRepository.save(new Todo("take out garbage"));
//        todoRepository.save(new Todo("go for a sunset drive"));
//        todoRepository.save(new Todo("hot shower", true, false));


    }
}
