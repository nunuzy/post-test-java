package com.belajar.postes.controllers;

import com.belajar.postes.models.User;
import com.belajar.postes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> users = userService.getAll();

        return  new ResponseEntity<>(users, HttpStatus.OK);

    }

    @PostMapping
    public  ResponseEntity<User> createUser(@RequestBody User user){
        User hasil = userService.create(user);

        return new ResponseEntity<>(hasil, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User hasil = userService.update(user);

        return new ResponseEntity<>(hasil, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void removeUser(@PathVariable("id") Integer id){
        userService.remove(id);
    }

}
