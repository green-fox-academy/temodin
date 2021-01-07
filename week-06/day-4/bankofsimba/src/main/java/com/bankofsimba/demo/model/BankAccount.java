package com.bankofsimba.demo.model;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private String currency;
    private boolean isGood;
    private boolean isKing;

    public BankAccount(String name, Double balance, String animalType, String currency, boolean isKing, boolean isGood) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
        this.isKing = isKing;
        this.isGood = isGood;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getCurrency() {
        return currency;
    }

    public String getKingOrSubject() {
        return this.isKing ? "K" : "S";
    }

    public String getGoodOrBad() {
        if (this.isGood) {return "Good Guy";}
        else {return "Bad Guy";}
    }
}
