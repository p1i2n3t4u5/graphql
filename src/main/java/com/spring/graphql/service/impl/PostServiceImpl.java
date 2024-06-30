package com.spring.graphql.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.graphql.entity.Post;
import com.spring.graphql.repository.PostRepository;
import com.spring.graphql.service.PostService;

@Service
public class PostServiceImpl implements PostService {
  
  private final PostRepository postRepository;
  
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> getAllPosts() {
    return postRepository.findAll();
  }

  @Override
  public Optional<Post> getPostById(Long id) {
    return postRepository.findById(id);
  }

}
