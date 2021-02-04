package com.example.demo.service;

import com.example.demo.model.Auction;
import com.example.demo.model.Bid;
import com.example.demo.repository.AuctionRepository;
import com.example.demo.repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Timestamp;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class AuctionService {
    AuctionRepository auctionRepository;
    BidRepository bidRepository;

    @Autowired
    public AuctionService(AuctionRepository auctionRepository, BidRepository bidRepository) {
        this.auctionRepository = auctionRepository;
        this.bidRepository = bidRepository;
    }

    public List<Auction> getAuctions() {
        return (List<Auction>) auctionRepository.findAll();
    }

    public Optional<Auction> findAuction(Long id) {
        return auctionRepository.findById(id);
    }

    public Integer getMaxAmount(Auction auction) {
        return auction.getBids().stream().max(Comparator.comparing(Bid::getAmount)).map(Bid::getAmount).orElseGet(() -> 0);
    }

    public Boolean isAuctionOver(Auction auction) {
        return (auction.getExpiryDate().before(new Timestamp(System.currentTimeMillis())));
    }

    public void addBid(Bid bid) {
        bidRepository.save(bid);
    }

    public Boolean isAmountGreater(Integer amount, Long id) {
        Integer maxAmount = getMaxAmount(findAuction(id).get());
        return amount > maxAmount;

    }
}
