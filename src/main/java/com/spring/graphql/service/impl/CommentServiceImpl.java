package com.spring.graphql.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.graphql.entity.Comment;
import com.spring.graphql.repository.CommentRepository;
import com.spring.graphql.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
  
 private final CommentRepository commentRepository;
  
  public CommentServiceImpl(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
  }

  @Override
  public List<Comment> getAllComments() {
    return commentRepository.findAll();
  }

  @Override
  public Optional<Comment> getCommentById(Long id) {
    return commentRepository.findById(id);
  }

}
