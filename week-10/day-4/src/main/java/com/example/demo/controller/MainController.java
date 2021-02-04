package com.example.demo.controller;

import com.example.demo.model.Auction;
import com.example.demo.model.Bid;
import com.example.demo.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@Controller
public class MainController {
    AuctionService auctionService;

    @Autowired
    public MainController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("auctions", auctionService.getAuctions());
        return "index";
    }

    @GetMapping("/{id}")
    public String getIndex(Model model, @PathVariable Long id, @RequestParam(required = false) String name, @RequestParam(required = false) Integer amount) {
        Optional<Auction> optionalAuction = auctionService.findAuction(id);
        model.addAttribute("maxamount", auctionService.getMaxAmount(optionalAuction.get()));
        model.addAttribute("auction", optionalAuction.get());
        model.addAttribute("isAuctionOver", auctionService.isAuctionOver(optionalAuction.get()));
        model.addAttribute("name", name);
        model.addAttribute("amount", amount);
        return "bid";
    }

    @PostMapping("/{id}")
    public String postBid(@PathVariable Long id, String name, Integer amount) {
        if (auctionService.isAmountGreater(amount,id)) {
            Bid bid = new Bid(name, amount, id);
            auctionService.addBid(bid);
            return "redirect:/" + id;
        }
        else {
            return "redirect:/" + id + "/?name=" + name + "&amount=" + amount ;
        }

    }

}
