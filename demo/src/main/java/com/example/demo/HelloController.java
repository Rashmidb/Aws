package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
	System.out.println("Hello git");
        LinkedList<Integer> list=new LinkedList<Integer>();
        return "Hello, World!";

    }
}