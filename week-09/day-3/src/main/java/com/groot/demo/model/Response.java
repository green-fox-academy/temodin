package com.groot.demo.model;

public class Response {
    private String received;
    private String translate;

    public Response(String received, String translate) {
        this.received = received;
        this.translate = translate;
    }

    public Response() {
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }
}
