package com.bankofsimba.demo.model;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private String currency;
    private Boolean isGood;
    private Boolean isKing;

    public BankAccount() {};

    public BankAccount(String name, Double balance, String animalType, String currency, Boolean isKing, Boolean isGood) {
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

    public Boolean getGood() {
        return isGood;
    }

    public Boolean getKing() {
        return isKing;
    }

    public String getKingOrSubject() {
        return this.isKing ? "♔" : "";
    }

    public String getGoodOrBad() {
        if (this.isGood) {return "Good Guy";}
        else {return "Bad Guy";}
    }

    public void increaseBalance() {
        if (this.isKing) {this.balance += 100;}
        else {this.balance += 10;}
    }

}