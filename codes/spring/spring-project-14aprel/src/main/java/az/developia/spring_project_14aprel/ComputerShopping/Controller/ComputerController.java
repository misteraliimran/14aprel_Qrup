package az.developia.spring_project_14aprel.ComputerShopping.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerController {

    List<Computer> computerList = new ArrayList<>();

    @GetMapping
    public List<Computer> getAllComputers() {

        return computerList;
    }

    @PostMapping
    public String addComputer(@RequestBody Computer computer) {

        computerList.add(computer);

        System.out.println(computer);

        return "Computer added successfully";
    }
}