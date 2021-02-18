package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieListerApplication implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(MovieListerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        userRepository.save(new User(1L,true,"bla","ROLE_USER","bla"));
    }
}
