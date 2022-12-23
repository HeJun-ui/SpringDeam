package com.service.impl;

import com.dao.UserRepository;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;



    @Override
    public User getUserByname(String username) {
        return userRepository.getUserByUsername(username);
    }




}
