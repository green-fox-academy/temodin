package com.example.demo.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Discover {

    public Integer page;
    public List<Movie> results;
    @SerializedName("total_pages")
    public Integer totalPages;
    @SerializedName("total_results")
    public Integer totalResults;

}
