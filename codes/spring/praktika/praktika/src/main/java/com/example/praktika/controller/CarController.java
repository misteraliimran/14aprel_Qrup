package com.example.praktika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String CarPage() {
        return "car";
    }

}