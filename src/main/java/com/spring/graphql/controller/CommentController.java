package com.spring.graphql.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graphql.entity.Comment;
import com.spring.graphql.service.CommentService;

@Controller
public class CommentController {

  @Autowired
  private CommentService commentService;

  @QueryMapping
  public Comment getCommentById(@Argument("id") Long id) {
    Optional<Comment> optComment = commentService.getCommentById(id);
    if (optComment.isPresent()) {
      return optComment.get();
    } else {
      return null;
    }
  }

}
