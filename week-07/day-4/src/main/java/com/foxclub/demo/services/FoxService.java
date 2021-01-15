package com.foxclub.demo.services;

import com.foxclub.demo.models.Drinks;
import com.foxclub.demo.models.Foods;
import com.foxclub.demo.models.Fox;
import com.foxclub.demo.models.Tricks;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter

@Service
public class FoxService {
    private List<Fox> foxes = new ArrayList<>();
    String errorMessage;
    String errorMessageType;
    public void addFox(String name) {
        Fox newFox = new Fox(name);
        //newFox.setUrlEncodedName(encode(name));
        //currentFox = newFox.getName();
        this.foxes.add(newFox);
    }

    public Fox getFox(String name) {
        return foxes.stream().filter(f -> f.getName().equals(name)).findAny().orElse(null);
    }

    public List<String> getFoods() {
        return Arrays.stream(Foods.values())
                .map(Enum::toString)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public List<String> getDrinks() {
        return Arrays.stream(Drinks.values())
                .map(Enum::toString)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public List<String> getTricks() {
        return Arrays.stream(Tricks.values())
                .map(Enum::toString)
                .map(s -> s.replace("_", " "))
                .collect(Collectors.toList());
    }

    public String encode(String stringToEncode) {
        String encodedString;
        try {
            encodedString = URLEncoder.encode(stringToEncode, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            encodedString = stringToEncode;
        }
        return encodedString;
    }


//    public void addTrick (String foxName, String trickName) {
//        getFox(foxName).addTrick(trickName);
//    }
}
