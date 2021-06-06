package com.it.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class bcryptPasswordEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
        String encode = bc.encode("hx123");
        System.out.println(encode);
    }
}
