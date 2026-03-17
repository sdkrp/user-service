package com.danny.user_service.controller;


import com.danny.user_service.dto.UserRequest;
import com.danny.user_service.dto.UserResponse;
import com.danny.user_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")

public class UserController {

    private final UserService userService;

    public UserController(UserService userService)
    {
        this.userService=userService;
    }

    @GetMapping
    public UserResponse getUser()
    {
      return  userService.getUser();
    }
    @PostMapping
    public UserResponse createUser(@RequestBody @Valid UserRequest request) {
        return userService.createUser(request);
    }
}
