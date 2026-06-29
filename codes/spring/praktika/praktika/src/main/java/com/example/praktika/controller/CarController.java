package com.example.praktika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.praktika.service.CarService;

import az.developia.spring_project_14aprel.service.UserService;

@Controller
public class CarController {
	@Autowired
	private CarService carService;

    @GetMapping("/cars")
    public String CarPage() {
        return "car";
    }

}