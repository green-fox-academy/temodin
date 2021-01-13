package com.di_exercises.demo;

import com.di_exercises.demo.colors.BlueColor;
import com.di_exercises.demo.colors.MyColor;
import com.di_exercises.demo.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private Printer printer;
    private MyColor myColor;

    @Autowired
    DemoApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("I am a happy printer");
        printer.log(myColor.printColor());
    }
}
