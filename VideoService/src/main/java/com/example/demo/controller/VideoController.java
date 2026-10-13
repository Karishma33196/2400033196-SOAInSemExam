package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @GetMapping("/videoservice")
    public String getVideo() {
        return "This is video service";
    }
}