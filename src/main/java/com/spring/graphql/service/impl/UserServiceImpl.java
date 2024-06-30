package com.spring.graphql.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.graphql.entity.User;
import com.spring.graphql.repository.UserRepository;
import com.spring.graphql.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  
  
  private final UserRepository userRepository;
 
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public Optional<User> getUserById(Long id) {
    return userRepository.findById(id);
  }

}
