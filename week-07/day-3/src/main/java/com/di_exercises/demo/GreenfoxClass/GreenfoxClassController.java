package com.di_exercises.demo.GreenfoxClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreenfoxClassController {
    StudentService studentService;

    @Autowired
    public GreenfoxClassController (StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("gfa")
    public String mainPage(Model model) {
        model.addAttribute("studentCount", studentService.count());
        return "gfa";
    }

    @GetMapping("gfa/list")
    public String studentList(Model model) {
        model.addAttribute("students",studentService.findAll());
        return "list";
    }

    @PostMapping("gfa/save")
    public String addStudent (String studentName) {
        studentService.save(studentName);
        return "redirect:/gfa";
    }

    @PostMapping("gfa/check")
    public String checkStudent (String studentName, Model model) {
        model.addAttribute("studentCheck", studentService.studentChecker(studentName));
        return "check";
    }






}
