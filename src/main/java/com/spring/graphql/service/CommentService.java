package com.spring.graphql.service;

import java.util.List;
import java.util.Optional;

import com.spring.graphql.entity.Comment;

public interface CommentService {

  public List<Comment> getAllComments();

  public Optional<Comment> getCommentById(Long id);

}
