package com.groot.demo.model;

public class Speed {
    private Integer distance;
    private Integer time;
    private Integer speed;

    public Speed(Integer distance, Integer time) {
        this.distance = distance;
        this.time = time;
        this.speed = distance / time;
    }

    public Speed() {
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
