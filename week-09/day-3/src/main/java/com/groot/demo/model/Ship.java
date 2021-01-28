package com.groot.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ship {
    private Integer caliber25 = 0;
    private Integer caliber30 = 0;
    private Integer caliber50 = 0;
    @JsonProperty(value = "shipstatus")
    private Integer shipStatus = 0;
    private Boolean ready = false;

    public void setReady() {
        if (this.shipStatus == 100) {
            this.ready = true;
        }
    }

    public Integer getCaliber25() {
        return caliber25;
    }

    public void setCaliber25(Integer caliber25) {
        this.caliber25 = caliber25;
    }

    public Integer getCaliber30() {
        return caliber30;
    }

    public void setCaliber30(Integer caliber30) {
        this.caliber30 = caliber30;
    }

    public Integer getCaliber50() {
        return caliber50;
    }

    public void setCaliber50(Integer caliber50) {
        this.caliber50 = caliber50;
    }

    public String getShipStatus() {
        if (shipStatus == 0) {
            return "empty";
        } else if (shipStatus == 100) {
            return "full";
        } else if (shipStatus > 100) {
            return "overloaded";
        } else {
            return shipStatus.toString() + "%";
        }
    }

    public Integer showTotalCargo() {
        return this.caliber25 + this.caliber30 + this.caliber50;
    }


    public void setShipStatus() {
        shipStatus = (int) (showTotalCargo() / 12500D * 100);
    }

    public void fillShip(String caliber, Integer amount) {
        switch (caliber) {
            case ".25":
                this.caliber25 += amount;
                break;
            case ".30":
                this.caliber30 += amount;
                break;
            case ".50":
                this.caliber50 += amount;
        }
        setShipStatus();
        setReady();
    }

    public Boolean getReady() {
        return ready;
    }
}
