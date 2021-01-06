package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(value = "/greetinglofasz")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("counter", atomicLong.getAndIncrement());
        return "greetinglofasz";
    }
}
