package com.example.systemSupermaketApi.controller;

import com.example.systemSupermaketApi.model.User;
import com.example.systemSupermaketApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getAllUser(){
        List<User> userList = userRepository.findAll();
        return userList;
    }
    @GetMapping("/user/{id}")/*Esse meto lista apenas o produto que passamos o id*/
    public User listaUserUnico(@PathVariable(value="id") long id){
        return userRepository.findById(id);

    }
    @PostMapping("/user")
    public User salvaUser(@RequestBody User user) {
        return userRepository.save(user);
    }


}
