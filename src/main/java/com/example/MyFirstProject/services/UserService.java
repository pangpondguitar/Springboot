package com.example.MyFirstProject.services;

import com.example.MyFirstProject.Models.Users;
import com.example.MyFirstProject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    final private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Users createUser(Users reqUser){
        Users user = new Users();
        user.setFullname(reqUser.getFullname());
        user.setUsername(reqUser.getUsername());
        repository.save(user);
        return user;
    }

    public List<Users> getUser() {
        return repository.findAll();
    }

    public Optional<Users> getById(Integer id){
        return repository.findById(id);
    }
}
