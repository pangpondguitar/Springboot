package com.example.MyFirstProject.controller;


import com.example.MyFirstProject.Models.Users;
import com.example.MyFirstProject.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {


    final private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Users createUser(@RequestBody Users user){
        return service.createUser(user);
    }

    @GetMapping("/")
    public List<Users> getUser(){
        return service.getUser();
    }

    @GetMapping("/{id}")
    public Optional<Users> getByIdUser(@PathVariable Integer id){
        return service.getById(id);
    }

}
