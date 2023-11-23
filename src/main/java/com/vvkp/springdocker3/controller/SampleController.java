package com.vvkp.springdocker3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/msg")
    public String getMessage(){
        return "Sample project for docker and jenkins integration";
    }
}
