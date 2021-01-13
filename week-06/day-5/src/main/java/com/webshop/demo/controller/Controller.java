package com.webshop.demo.controller;

import com.webshop.demo.model.ShopItem;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@org.springframework.stereotype.Controller
public class Controller {

    private List<ShopItem> items = new ArrayList<>();
    private List<ShopItem> currentItems = new ArrayList<>();
    private String currency = "EUR";

    public Controller() {
        items.add(new ShopItem("duplo", "building blocks", 30, 10, "building"));
        items.add(new ShopItem("lego", "small building blocks", 20, 30, "building"));
        items.add(new ShopItem("dinosaur", "plastic toy", 10, 100, "figures"));
        items.add(new ShopItem("mouse board game", "children board game", 50, 10, "boardgame"));
        items.add(new ShopItem("color pencils", "pencils", 30, 0, "creative"));
        items.add(new ShopItem("color pencils", "genuine stabilo creative accessory", 30, 0, "creative"));
        items.add(new ShopItem("color sharpie", "pencil-like creative accessory", 30, 0,"creative"));
        currentItems = items;
    }

    @GetMapping("/itemlist")
    public String showItems(Model model) {
        model.addAttribute("items", currentItems);
        model.addAttribute("currency",currency);
        return "itemlist";
    }

    @GetMapping("/only-available")
    public String showOnlyAvailable(Model model) {
        List<ShopItem> availableItems = items
                .stream()
                .filter(i -> i.getQuantityOfStock() != 0)
                .collect(Collectors.toList());
        model.addAttribute("items", availableItems);
        return "itemlist";
    }

    @GetMapping("/cheapest-first")
    public String showCheapestFirst(Model model) {
        List<ShopItem> cheapFirst = items
                .stream()
                .sorted(Comparator.comparingInt(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("items", cheapFirst);
        return "itemlist";
    }

    @GetMapping("/contains-pencil")
    public String showPencil(Model model) {
        List<ShopItem> pencilOnly = items
                .stream()
                .filter(i -> i.getName().contains("pencil") || i.getDescription().contains("pencil"))
                .collect(Collectors.toList());
        model.addAttribute("items", pencilOnly);
        return "itemlist";
    }

    @GetMapping("/average-stock")
    public String showAverageStock(Model model) {
        Double averageStock = items
                .stream()
                .mapToDouble(ShopItem::getQuantityOfStock)
                .average()
                .orElse(0);
        model.addAttribute("averageStock", averageStock);
        return "averagestock";
    }

    @GetMapping("/most-expensive")
    public String showMostExpensive(Model model) {
        ShopItem mostExpensive = items
                .stream()
                .max(Comparator.comparing(ShopItem::getPrice))
                .orElse(null);
                model.addAttribute("mostExpensive", mostExpensive.getName() + " for " + mostExpensive.getPrice() + " bucks");
        return "averagestock";
    }

    @GetMapping("/back-to-main")
    public String backToMain(Model model) {
        currentItems = items;
        model.addAttribute("items", currentItems);
        return "itemlist";
    }

    @PostMapping("/search-by-name")
    public String searchByName (Model model, @RequestParam String keyWord) {
        currentItems = items
                .stream()
                .filter(i -> i.getName().contains(keyWord) || i.getDescription().contains(keyWord))
                .collect(Collectors.toList());
        return "redirect:/itemlist";
    }

    @PostMapping("/filter-by-type")
    public String filterByType (Model model, @RequestParam String type)    {
        currentItems = items
                .stream()
                .filter(i -> i.getType().equals(type))
                .collect(Collectors.toList());
        return "redirect:/itemlist";
    }

    @GetMapping("/change-currency")
    public String filterByType (Model model)    {
        if (currency.equals("EUR")) {currency = "HUF";}
        else {currency = "EUR";}
        currentItems = items;
        model.addAttribute("currency", currency);
        model.addAttribute("items", currentItems);
        return "itemlist";
    }

}
