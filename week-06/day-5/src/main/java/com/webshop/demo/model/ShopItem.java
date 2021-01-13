package com.webshop.demo.model;

public class ShopItem {


    private String name;
    private String description;
    private Integer price;
    private Integer quantityOfStock;
    private String type;

    public ShopItem(String name, String description, Integer price, Integer quantityOfStock, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
        this.type = type;
    }

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

    public String getType() {
        return type;
    }

    public Integer getPriceInHuf () {
        return price * 360;
    }
}
