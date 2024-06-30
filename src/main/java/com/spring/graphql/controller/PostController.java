package com.spring.graphql.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graphql.entity.Post;
import com.spring.graphql.service.PostService;

@Controller
public class PostController {
  
  @Autowired
  private PostService postService;

  @QueryMapping
  public Post getPostById(@Argument("id") Long id) {
    Optional<Post> optPost = postService.getPostById(id);
    if (optPost.isPresent()) {
      return optPost.get();
    } else {
      return null;
    }
  }

}
