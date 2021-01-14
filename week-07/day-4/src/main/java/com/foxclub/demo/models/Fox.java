package com.foxclub.demo.models;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter

public class Fox {

    @NonNull
    private String name;
    private List<String> tricks = new ArrayList<>();
    private String food = "dirt";
    private String drink = "mud";

    public void addTrick (String trick) {
        this.tricks.add(trick);
    }


}
