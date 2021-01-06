package com.greenfoxacademy.springstart;


import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private long id =1;
    private String content;
    static AtomicLong atomiclong = new AtomicLong(1);


    public Greeting(String content) {
        //this.id = 1L;
        this.content = content;
    }

    public long getId() {
        return atomiclong.getAndIncrement();
    }

    public String getContent() {
        return content;
    }
}
