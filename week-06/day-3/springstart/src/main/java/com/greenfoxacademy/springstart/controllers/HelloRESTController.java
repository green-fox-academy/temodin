package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

   // AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(value="/greeting")

    public Greeting greeting (@RequestParam String name) {
        return new Greeting("hellószia, " + name + ".");
    }
}
