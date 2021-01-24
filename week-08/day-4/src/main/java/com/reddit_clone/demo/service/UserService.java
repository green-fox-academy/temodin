package com.reddit_clone.demo.service;

import com.reddit_clone.demo.model.User;
import com.reddit_clone.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;


    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    private User activeUser;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void loginOrRegister(User user) {

        String name = user.getName();
        Optional<User> optionalUser = userRepository.findByName(name);

        this.activeUser = optionalUser.orElseGet(() -> userRepository.save(user));
//        if (optionalUser.isPresent()) {activeUser = optionalUser.get();}
//        else {activeUser = userRepository.save(user);}

    }

}
