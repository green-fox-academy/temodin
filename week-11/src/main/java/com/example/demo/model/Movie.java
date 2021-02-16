package com.example.demo.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Movie {
    String title;
    String status;
    Integer runtime;
    Integer revenue;
    @SerializedName("released_date")
    String releasedDate;

 }
