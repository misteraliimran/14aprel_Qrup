package com.example.praktika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.praktika.entiy.Car;
import com.example.praktika.repository.CarRepository;
import com.example.praktika.requestDto.CarRequestDto;

@Service
public class CarService {
	@Autowired
	  private CarRepository carRepository;
	public void addCar(CarRequestDto carRequestDto) {
		Car car = new Car();
		car.setModel(carrequestdto);
}
	}