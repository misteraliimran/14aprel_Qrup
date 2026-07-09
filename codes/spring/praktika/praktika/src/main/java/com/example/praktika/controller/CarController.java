package com.example.praktika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.praktika.requestDto.CarRequestDto;
import com.example.praktika.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public String addCar(@RequestBody CarRequestDto carRequestDto) {
        carService.addCar(carRequestDto);
        return "Car added successfully";
    }

}