package com.blog.util_14th_Dec;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MainUtil3 {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("testing"));

    }
}
