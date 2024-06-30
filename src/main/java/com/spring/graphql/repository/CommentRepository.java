package com.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.graphql.entity.Comment;

public interface CommentRepository  extends JpaRepository<Comment,Long> {

}
