package com.groot.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipFill {
    private String received;
    private Integer amount;
    @JsonProperty(value = "shipstatus")
    private String shipStatus;
    private Boolean ready;

    public ShipFill(String received, Integer amount, String shipStatus, Boolean ready) {
        this.received = received;
        this.amount = amount;
        this.shipStatus = shipStatus;
        this.ready = ready;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(String shipStatus) {
        this.shipStatus = shipStatus;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }
}
