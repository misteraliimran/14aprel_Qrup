package az.developia.spring_project_14aprel.RequestDto;

import lombok.Data;

@Data
public class ComputerRequestDto {

    private Long id;
    private String brand;
    private String model;
    private Double price;
}