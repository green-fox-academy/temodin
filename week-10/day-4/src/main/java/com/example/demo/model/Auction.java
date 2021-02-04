package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Timestamp expiryDate;
    @OneToMany (mappedBy = "auction")
    private List<Bid> bids;

    public Auction(String title, Timestamp expiryDate) {
        this.title = title;
        this.expiryDate = expiryDate;
    }
}
