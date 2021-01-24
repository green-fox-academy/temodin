package com.reddit_clone.demo.service;

import com.reddit_clone.demo.model.Post;
import com.reddit_clone.demo.repository.PostRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    PostRepository postRepository;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    Integer currentPage = 0;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> listPosts () {
        return postRepository.findAllByOrderByScoreDesc();
    }

    public void addPost (Post post) {
        postRepository.save(post);
    }

    public String vote (Long id, Integer value) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isPresent()) {
            Post notNullPost = post.get();
            notNullPost.setScore(notNullPost.getScore()+value);
            postRepository.save(notNullPost);
            return "success";
        }
        else {return "failed";}
    }

    public Page<Post> getPage (Integer pageNum) {
        Pageable pageable = PageRequest.of(pageNum, 5);
        return postRepository.findAllPostsWithPagination(pageable);
    }

    public Integer getPageCount () {
        return (int) (Math.ceil(postRepository.count() / 5d));
    }

    public Long getNum () {
        return postRepository.count();
    }

}
