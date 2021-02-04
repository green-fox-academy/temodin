package com.example.demo.repository;

import com.example.demo.model.Auction;
import com.example.demo.model.Bid;
import org.springframework.data.repository.CrudRepository;

public interface BidRepository extends CrudRepository<Bid, Long> {


}
