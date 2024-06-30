package com.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.graphql.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
