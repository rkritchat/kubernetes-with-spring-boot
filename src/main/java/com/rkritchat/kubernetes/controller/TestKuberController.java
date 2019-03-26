package com.rkritchat.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestKuberController {

    @GetMapping
    public String testKuber(){
        return "Wored...";
    }
}
