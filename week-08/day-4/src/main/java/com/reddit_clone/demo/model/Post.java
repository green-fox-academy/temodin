package com.reddit_clone.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Getter
@Setter

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String url;
    private Integer score = 0;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm");
    private Timestamp created = new Timestamp(System.currentTimeMillis());

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user = new User();


    public Post(String title, String url, Long userId) {
        this.title = title;
        this.url = url;
        this.user.setId(userId);
    }

    public Post() {
    }


    public String getCreatedString() {

        return (created == null) ? "" : sdf.format(created);
    }

    public String getValidUrl() {
        return (url.substring(0, 4).equals("http")) ? url : "http://" + url;
    }

}
