package com.example.praktika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.praktika.entiy.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}