package com.foxclub.demo.controllers;

import com.foxclub.demo.models.Fox;
import com.foxclub.demo.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Controller
public class MainController {
    FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    public String encode(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    }

    public String decode(String value) throws UnsupportedEncodingException {
        return URLDecoder.decode(value, StandardCharsets.UTF_8.toString());
    }


    @GetMapping("/index")
    public String getIndex(@RequestParam(required = false) String loginname, Model model) {
        try {
            Fox currentFox = foxService.getFox(decode(loginname));
            model.addAttribute("name", currentFox.getName());
            model.addAttribute("food", currentFox.getFood());
            model.addAttribute("drink", currentFox.getDrink());
            model.addAttribute("trickCount", currentFox.getTricks().size());
            model.addAttribute("tricks", currentFox.getTricks());
        } catch (Exception e) {
            return "redirect:/login";
        }
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String sendLogin(@RequestParam String loginname) {
        Fox currentFox = foxService.getFox(loginname);
        if (currentFox == null) {
            return "redirect:/login";
        } else
            return "redirect:/index?loginname=" + currentFox.getName();
    }

    @PostMapping("/create")
    public String createLogin(@RequestParam String newname) throws UnsupportedEncodingException {
        foxService.addFox(newname);
        Fox currentFox = foxService.getFox(newname);
        return "redirect:/index?loginname=" + encode(currentFox.getName());
    }

    @GetMapping("/foodstore")
    public String getFoodstore(@RequestParam String loginname, Model model) throws UnsupportedEncodingException {
        Fox currentFox = foxService.getFox(decode(loginname));
        model.addAttribute("name", currentFox.getName());
        model.addAttribute("currentfood",currentFox.getFood());
        model.addAttribute("currentdrink",currentFox.getDrink());
        model.addAttribute("foods", foxService.getFoods());
        model.addAttribute("drinks", foxService.getDrinks());
        return "foodstore";
    }

    @PostMapping("/feed")
    public String feed(@RequestParam String loginname, String food, String drink) throws UnsupportedEncodingException {
        Fox currentFox = foxService.getFox(loginname);
        currentFox.setFood(food);
        currentFox.setDrink(drink);
        return "redirect:/index?loginname=" + currentFox.getName();
    }

    @GetMapping("/trickcenter")
    public String getTrickCenter(@RequestParam String loginname, Model model) throws UnsupportedEncodingException {
        Fox currentFox = foxService.getFox(decode(loginname));
        model.addAttribute("name", currentFox.getName());
        model.addAttribute("tricks", foxService.getTricks());
        return "trickcenter";
    }

    @PostMapping("/learn")
    public String learn(@RequestParam String loginname, String trick) throws UnsupportedEncodingException {
        Fox currentFox = foxService.getFox(loginname);
        currentFox.addTrick(trick);
        return "redirect:/index?loginname=" + currentFox.getName();
    }


}
