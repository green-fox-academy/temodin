package com.example.demo.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    @Column(length = 1000)
    String overview;
    @SerializedName("vote_average")
    Double voteAverage;
    @SerializedName("vote_count")
    Integer voteCount;
    @SerializedName("release_date")
    String releasedDate;

}
