package com.springstudy.nginx1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NginxController {

    @GetMapping("/")
    public String index() {
        return "nginx https 리다렉트 성공";
    }
}
