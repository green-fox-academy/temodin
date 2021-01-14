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


    @GetMapping("/index")
    public String getIndex(@RequestParam(required = false) String name, Model model) {
        try {
            Fox currentFox = foxService.getFox(name);
            model.addAttribute("name", currentFox.getName());
            model.addAttribute("urlname", currentFox.getUrlEncodedName());
            model.addAttribute("food", currentFox.getFood());
            model.addAttribute("drink", currentFox.getDrink());
            model.addAttribute("trickCount", currentFox.getTricks().size());
            model.addAttribute("tricks", currentFox.getTricks());
        } catch (NullPointerException e) {
            return "redirect:/login";
        }
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String sendLogin(@RequestParam String name) {
        Fox currentFox = foxService.getFox(name);
        if (currentFox == null) {
            return "redirect:/login";
        } else
            return "redirect:/index?name=" + currentFox.getUrlEncodedName();
    }

    @PostMapping("/create")
    public String createLogin(@RequestParam String newname) {
        foxService.addFox(newname);
        Fox currentFox = foxService.getFox(newname);
        return "redirect:/index?name=" + currentFox.getUrlEncodedName();
    }

    @GetMapping("/foodstore")
    public String getFoodstore(@RequestParam String name, Model model) {
        Fox currentFox = foxService.getFox(name);
        model.addAttribute("name", currentFox.getName());
        model.addAttribute("urlname", currentFox.getUrlEncodedName());
        model.addAttribute("foods", foxService.getFoods());
        model.addAttribute("drinks", foxService.getDrinks());
        return "foodstore";
    }

    @PostMapping("/feed")
    public String feed(@RequestParam String name, String food, String drink) {
        foxService.getFox(name).setFood(food);
        foxService.getFox(name).setDrink(drink);
        return "redirect:/index?name=" + foxService.encode(name);
    }

    @GetMapping("/trickcenter")
    public String getTrickCenter(@RequestParam String name, Model model) {
            Fox currentFox = foxService.getFox(name);
        model.addAttribute("name", currentFox.getName());
        model.addAttribute("urlname", currentFox.getUrlEncodedName());
        model.addAttribute("tricks", foxService.getTricks());
        return "trickcenter";
    }

    @PostMapping("/learn")
    public String learn(@RequestParam String name, String trick) {
        foxService.getFox(name).setTricks(trick);
        return "redirect:/index?name=" + foxService.encode(name);
    }


}
