package com.project.onlinebookstore.controller;

import com.project.onlinebookstore.entity.Users;
import com.project.onlinebookstore.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/reg/users")
    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

    @PostMapping("/reg/users")
    public ResponseEntity<Users> createUser(@RequestBody Users user){
        Users _user = usersRepository.save(user);
        return ResponseEntity.ok().body(_user);
    }

}
