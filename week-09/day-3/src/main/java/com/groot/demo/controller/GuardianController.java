package com.groot.demo.controller;

import com.groot.demo.model.*;
import com.groot.demo.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {
    Ship myShip = new Ship();

    @PostMapping("/postgroot")
    public ResponseEntity<?> postGrootBack(@RequestBody Message message) {
        if (message == null || message.getMessage().equals("")) {
            return new ResponseEntity<>(new Error("I am groot!"), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new Response(message.getMessage(), "I am groot!"), HttpStatus.OK);
        }
    }

    @GetMapping("/getgroot")
    public ResponseEntity<?> getGrootBack(@RequestParam(required = false) String message) {
        if (message == null) {
            return new ResponseEntity<>(new Error("I am groot!"), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new Response(message, "I am groot!"), HttpStatus.OK);
        }
    }

    @GetMapping("/yondu")
    public ResponseEntity<?> calcSpeed(@RequestParam(required = false) Integer time, @RequestParam(required = false) Integer distance) {
        if (time == null || distance == null || distance < 0 || time <= 0) {
            return new ResponseEntity<>(new Error("Wrong input."), HttpStatus.BAD_REQUEST);
        }
        else return new ResponseEntity<>(new Speed(distance,time),HttpStatus.OK);
    }

    @GetMapping ("/rocket")
    public ResponseEntity<Ship> getShipCargo () {
        return new ResponseEntity<>(myShip,HttpStatus.OK);
    }

    @GetMapping("/rocket/fill")
    public ResponseEntity<?> fillShip (@RequestParam (required = false) String caliber, @RequestParam (required = false) Integer amount) {

    }


}
