package com.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.graphql.entity.Post;

public interface PostRepository  extends JpaRepository<Post,Long> {

}
