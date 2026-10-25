package az.developia.spring_project_14aprel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.service.ComputerService;

@RestController
@RequestMapping("/computers")
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @GetMapping
    public List<Computer> getAll() {
        return computerService.getAll();
    }

    @PostMapping
    public Computer add(@RequestBody Computer computer) {
        return computerService.add(computer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        computerService.delete(id);
    }
}