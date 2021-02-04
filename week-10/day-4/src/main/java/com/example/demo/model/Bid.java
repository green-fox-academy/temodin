package com.example.demo.model;

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

public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer amount;
    @ManyToOne
    @JoinColumn (name= "auction_id")
    private Auction auction = new Auction();

    public Bid(String name, Integer amount, Long auctionId) {
        this.name = name;
        this.amount = amount;
        this.auction.setId(auctionId);
    }
}
