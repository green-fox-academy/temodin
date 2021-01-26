package com.example.rest_lesson.controller;


import com.example.rest_lesson.LogRepository;
import com.example.rest_lesson.model.*;
import com.example.rest_lesson.model.Error;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.json.JSONParser;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    LogRepository logRepository;
    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    public RestController(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @GetMapping("doubling")
    public ResponseEntity<?> getDoubleInt(@RequestParam(required = false) Integer input) {
        logRepository.save(new Log(new Timestamp(System.currentTimeMillis()),"doubling","input=" + input.toString()));
        if (input != null) {
            return new ResponseEntity<>(new DoubleInt(input), HttpStatus.OK);
        } else return new ResponseEntity<>(new Error("Please provide an input!"), HttpStatus.OK);
    }

    @GetMapping("greeter")
    public ResponseEntity<?> getGreeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        logRepository.save(new Log(new Timestamp(System.currentTimeMillis()),"greeter","name=" + name + ", title=" + title));
        if (name == null && title == null) {
            return new ResponseEntity<>(new Error("Please provide a name and a title!"), HttpStatus.BAD_REQUEST);
        } else if (name == null) {
            return new ResponseEntity<>(new Error("Please provide a name!"), HttpStatus.BAD_REQUEST);
        } else if (title == null) {
            return new ResponseEntity<>(new Error("Please provide a title!"), HttpStatus.BAD_REQUEST);
        } else return new ResponseEntity<>(new Welcome(name, title), HttpStatus.OK);
    }

    @GetMapping("appenda/{appendable}")
    public ResponseEntity<?> appendA(@PathVariable String appendable) {
        logRepository.save(new Log(new Timestamp(System.currentTimeMillis()),"appendable","appendable=" + appendable));
        return new ResponseEntity<>(new Appended(appendable), HttpStatus.OK);
    }

    @PostMapping("dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable(required = false) String action, @RequestBody InputNumber inputNumberDTO) throws JsonProcessingException {
        //logRepository.save(new Log(new Timestamp(System.currentTimeMillis()),"dountil","action="+ action +", until=" +inputNumberDTO.getUntil()));

        logRepository.save(new Log(new Timestamp(System.currentTimeMillis()),"dountil",mapper.writeValueAsString(inputNumberDTO)));

        //ModelMapper mapper =new ModelMapper();
        //String data = inputNumberDTO.getB
        if (action.equals("sum")) {
            Integer sumUntil = 0;
            for (int i = 1; i < inputNumberDTO.getUntil() + 1; i++) {
                sumUntil += i;
            }
            return new ResponseEntity<>(new Result(sumUntil), HttpStatus.OK);
        } else if (action.equals("factor")) {
            Integer factorUntil = 1;
            for (int i = 1; i < inputNumberDTO.getUntil() + 1; i++) {
                factorUntil *= i;
            }
            return new ResponseEntity<>(new Result(factorUntil), HttpStatus.OK);
        }
        return new ResponseEntity<>(new Error("Please provide a number!"),HttpStatus.NOT_FOUND);
    }

    @PostMapping("arrays")
    public ResponseEntity<?> arrayHandler (@RequestBody (required = false) ArrayHandler arrayHandler) throws JsonProcessingException {
        //logRepository.save(new Log(new Timestamp(System.currentTimeMillis()),"arrays","what="+ arrayHandler.getWhat() +", numbers=" +arrayHandler.getNumbers().toString()));
        logRepository.save(new Log(new Timestamp(System.currentTimeMillis()),"dountil",mapper.writeValueAsString(arrayHandler)));

        if (arrayHandler == null) {
            return new ResponseEntity<>(new Error("Please send a json, Jackson!"),HttpStatus.NOT_FOUND);}
        else if (arrayHandler.getNumbers().size() == 0) {
            return new ResponseEntity<>(new Error("Please send me some numbers!"),HttpStatus.NOT_FOUND);
        }
        else if (arrayHandler.getWhat().equals("sum")) {
            return new ResponseEntity<>(new Result(arrayHandler.getNumbers().stream().reduce(0,(a,b) -> a+ b )),HttpStatus.OK);
        }
        else if (arrayHandler.getWhat().equals("multiply")) {
            return new ResponseEntity<>(new Result(arrayHandler.getNumbers().stream().reduce(1,(a,b) -> a * b )),HttpStatus.OK);
        }
        else if (arrayHandler.getWhat().equals("double")) {
            return new ResponseEntity<>(new ResultList(arrayHandler.getNumbers().stream().map(a -> a*2).collect(Collectors.toList())),HttpStatus.OK);
        }

        return new ResponseEntity<>(new Error("Please provide what to do with the numbers!"),HttpStatus.NOT_FOUND);

    }

    @GetMapping ("log")
    public LogSummary getLogs () {
        List<Log> logList = (List<Log>) logRepository.findAll();
        LogSummary logSummary = new LogSummary(logList,logList.size());
        return logSummary;
    }

}
