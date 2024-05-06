package com.example.ex3ControllerGetPost.controllers;

import com.example.ex3ControllerGetPost.services.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @Autowired
    Name name;

    @GetMapping(path = "/name")
    public String getName(@RequestParam String name) {
        return this.name.get(name);
    }

    @PostMapping("/name/reversedName")
    public String reverseName(@RequestParam String name) {
        return this.name.reverse(name);
    }
}
