package com.example.demo;

import com.example.demo.model.Auction;
import com.example.demo.repository.AuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class AuctionApplication implements CommandLineRunner {
    AuctionRepository auctionRepository;

    @Autowired
    public AuctionApplication(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AuctionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        auctionRepository.save(new Auction("kakkukkosóra", convertToTimeStamp("2021-03-20 12:03")));
//        auctionRepository.save(new Auction("műfütyi", convertToTimeStamp("2021-02-26 16:03")));
//        auctionRepository.save(new Auction("kuflimobil", convertToTimeStamp("2021-04-12 09:03")));
 //       auctionRepository.save(new Auction("kiskutya", convertToTimeStamp("2020-03-15 11:03")));
    }

    public static Timestamp convertToTimeStamp (String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date parsedDate = dateFormat.parse(dateString);
        return new java.sql.Timestamp(parsedDate.getTime());
    }
}
