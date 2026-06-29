package az.developia.spring_project_14aprel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.service.ComputerService;

@RestController
@RequestMapping("/computers")
public class ComputerController {

	@Autowired
	private ComputerService computerService;

	@GetMapping("/price")
	public List<Computer> findBooksByPriceRange(@RequestParam Double a, @RequestParam Double b) {

		return computerService.findBooksByPriceRange(a, b);
	}
}