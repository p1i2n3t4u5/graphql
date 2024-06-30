package com.spring.graphql.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graphql.entity.User;
import com.spring.graphql.service.UserService;

@Controller
public class UserController {
  
  @Autowired
  private UserService userService;
  
  @QueryMapping
  public User getUserById(@Argument("id") Long id) {
   Optional<User> optUser = userService.getUserById(id);
     if (optUser.isPresent()) {
       return optUser.get();
    } else {
      return null;
    }
  }


}
