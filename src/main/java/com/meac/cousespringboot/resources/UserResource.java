package com.meac.cousespringboot.resources;

import com.meac.cousespringboot.entities.User;
import com.meac.cousespringboot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserServices service;
    // Endpoint to get users
    @GetMapping
   public ResponseEntity<List<User>> findAll() {
       List<User> users = service.findAll();
       return ResponseEntity.ok().body(users);
   }

   @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }



}
