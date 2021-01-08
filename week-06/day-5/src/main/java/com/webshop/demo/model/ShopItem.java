package com.webshop.demo.model;

public class ShopItem {
    public ShopItem(String name, String description, Integer price, Integer quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    private String name;
    private String description;
    private Integer price;
    private Integer quantityOfStock;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantityOfStock() {
        return quantityOfStock;
    }
}
