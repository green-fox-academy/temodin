package com.di_exercises.demo.usefulutilities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UtilityService {

    private List<String> colors;
    private Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }


    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }

    public List<String> caesarDecode (String text) {
        List<String> decodedList= new ArrayList<>();
        for (int i = 1; i < 27; i++) {
        decodedList.add(caesar(text,i));
        }
        return decodedList;
    }

    public List<String> validateEmail (String email) {
        List<String> validationOutput = new ArrayList<>();
        if (email.contains("@") && email.contains(".")) {
            validationOutput.add(email + " is a valid email address");
            validationOutput.add("green");
        }
        else {
            validationOutput.add(email + " is not a valid email address");
            validationOutput.add("red");}
        return validationOutput;
    }


}