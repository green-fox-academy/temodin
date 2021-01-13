package com.di_exercises.demo;

import com.di_exercises.demo.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private Printer printer;

    @Autowired
    DemoApplication(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("I am a happy printer");
    }
}
