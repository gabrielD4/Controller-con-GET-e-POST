package com.example.ex3ControllerGetPost.services;

import org.springframework.stereotype.Service;

@Service
public class Name {

    public String reverse(String name) {
        StringBuilder reversedName = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedName.append(name.charAt(i));
        }
        return String.valueOf(reversedName);
    }

    public String get(String name) {
        return name;
    }
}
