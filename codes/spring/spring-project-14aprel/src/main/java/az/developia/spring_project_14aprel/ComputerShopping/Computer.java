package az.developia.spring_project_14aprel.ComputerShopping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer {

    private Long id;
    private String brand;
    private String model;

}