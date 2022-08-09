package com.example.testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class test {

        @GetMapping
        private String springBootHello() {
            return "test....";
        }


        @GetMapping("/testing")
        private String springBootHelloWorld(){
            return "testing";
        }

        @GetMapping("/h")
        private String spring(){
            return "gh";
        }
}
