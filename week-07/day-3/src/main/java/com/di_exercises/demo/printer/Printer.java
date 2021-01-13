package com.di_exercises.demo.printer;

import com.di_exercises.demo.colors.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class Printer {

    public void log(String message) {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "] my printer says: " + message);
    }
}
