package com.educandoweb.course.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = new ArrayList<>();
        list.add(new User(1L, "Maria", "maria@gmail.com", "99999999", "12345"));
        list.add(new User(2L, "Alex", "alex@gmail.com", "88888888", "12345"));
        return ResponseEntity.ok().body(list);
    }
}