package com.reddit_clone.demo.controller;

import com.reddit_clone.demo.model.Post;
import com.reddit_clone.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    PostService postService;

    @Autowired
    public MainController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping({"/","/index"})
    public String getIndex (Model model, @RequestParam(required = false, defaultValue = "0") Integer currentPage) {
       model.addAttribute("postList",postService.getPage(currentPage));
       model.addAttribute("currentPage",currentPage);
       model.addAttribute("pageCount", postService.getPageCount());
        System.out.println(postService.getNum());
        return "index";
    }

    @GetMapping ("/new")
    public String getNew () {
        return "new";
    }

    @PostMapping ("/add-post")
    public String addPost (@ModelAttribute Post post) {
        postService.addPost(post);
        return "redirect:/";
    }

    @GetMapping ("vote")
    public String downVote (@RequestParam Long id,@RequestParam Integer value) {
        if (postService.vote(id,value).equals("success")) {
            return "redirect:/";
        } else {return "redirect:/";} // add here a failed requestparam
    }




}


