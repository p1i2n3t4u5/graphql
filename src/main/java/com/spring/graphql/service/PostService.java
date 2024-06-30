package com.spring.graphql.service;

import java.util.List;
import java.util.Optional;

import com.spring.graphql.entity.Post;

public interface PostService {
  
  public List<Post> getAllPosts();
  
  public Optional<Post> getPostById(Long id);

}
