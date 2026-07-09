package com.example.praktika.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarRequestDto {

    private Long id;
    private String brand;
    private String model;
    private Double price;
    private Integer year;

}