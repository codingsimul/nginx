package com.springstudy.nginx1;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NginxController {

    @GetMapping("/")
    public ResponseEntity<?> index() {
        ResponseEntity<String> response = ResponseEntity.ok("Hello World");
        System.out.println("💡 Hello from nginx!");
        return response;
    }
}
