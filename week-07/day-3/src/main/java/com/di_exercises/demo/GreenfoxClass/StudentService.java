package com.di_exercises.demo.GreenfoxClass;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public Integer count() {
        return names.size();
    }

    public String studentChecker (String student) {
        if (names.contains(student)) {
            return "Student exists";
        }
        else {return "Student doesn't exist";}
    }
}