package com.spring.graphql.service;

import java.util.List;
import java.util.Optional;

import com.spring.graphql.entity.User;

public interface UserService {
  
  public List<User> getAllUsers();
  
  public Optional<User> getUserById(Long id);

}
