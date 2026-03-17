package com.danny.user_service.service;


import com.danny.user_service.dto.UserRequest;
import com.danny.user_service.dto.UserResponse;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public UserResponse getUser(){
        return new UserResponse("Danny","Danny@gmail.com");
    }

    public UserResponse createUser(@Valid  UserRequest request) {

        return new UserResponse(request.name(), request.email());
    }
}
