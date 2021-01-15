package com.foxclub.demo.models;

import lombok.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Fox {

    private String name;
    //private String urlEncodedName;
    private List<String> tricks = new ArrayList<>();
    private String food = "dirt";
    private String drink = "mud";

    public Fox(String name) {
        this.name = name;
    }

    public void setTricks (String trick) {
        this.tricks.add(trick);
    }

    public String encode(String stringToEncode) {
        String encodedString;
        try {
            encodedString = URLEncoder.encode(stringToEncode, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            encodedString = null;
        }
        return encodedString;
    }

    public String getUrlEncodedName () {
        return encode(this.name);
    }

    public boolean getIfClown () {
        return tricks.stream().anyMatch(t -> t.equals("be a clown"));
    }

}
