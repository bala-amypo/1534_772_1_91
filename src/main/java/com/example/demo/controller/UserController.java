package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return userService.getById(id);
    }
}