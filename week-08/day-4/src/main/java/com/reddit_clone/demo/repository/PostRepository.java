package com.reddit_clone.demo.repository;

import com.reddit_clone.demo.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post,Long> {
    List<Post> findAllByOrderByScoreDesc();

  @Query(nativeQuery = true,value = "SELECT * FROM post ORDER BY score desc")
  Page<Post> findAllPostsWithPagination(Pageable pageable);
}
