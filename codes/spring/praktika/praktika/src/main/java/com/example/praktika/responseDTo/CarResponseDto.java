package com.example.praktika.responseDTo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarResponseDto {

    private Long id;
    private String brand;
    private String model;

}