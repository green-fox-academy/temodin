package com.reddit_clone.demo.controller;

import com.reddit_clone.demo.model.Post;
import com.reddit_clone.demo.model.User;
import com.reddit_clone.demo.service.PostService;
import com.reddit_clone.demo.service.UserService;
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
    UserService userService;

    @Autowired
    public MainController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping({"/", "/index"})
    public String getIndex(Model model, @RequestParam(required = false, defaultValue = "0") Integer currentPage) {
        String userName = null;
        if (userService.getActiveUser() != null) {userName = userService.getActiveUser().getName();}
        model.addAttribute("postList", postService.getPage(currentPage));
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("pageCount", postService.getPageCount());
        model.addAttribute("userName",userName);
        System.out.println(postService.getNum());
        return "index";
    }

    @GetMapping("/new")
    public String getNew() {
        return "new";
    }

    @PostMapping("/add-post")
    public String addPost(@ModelAttribute Post post) {
       // postService.addPost(post);
        postService.addPost(new Post(post.getTitle(), post.getUrl(), userService.getActiveUser().getId()));
        return "redirect:/";
    }

    @GetMapping("vote")
    public String downVote(@RequestParam Long id, @RequestParam Integer value,@RequestParam Integer page) {
        if (postService.vote(id, value).equals("success")) {
            return "redirect:/?currentPage=" + page;
        } else {
            return "redirect:/?currentPage=" + page;
        } // add here a failed requestparam
    }

    @GetMapping("add-login")
    public String getLogin () {
        return "login";
    }

    @PostMapping("login")
    public String login (@ModelAttribute User user) {
        userService.loginOrRegister(user);
        return "redirect:/";
    }

}


