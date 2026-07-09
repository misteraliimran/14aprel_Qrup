package az.developia.spring_project_14aprel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.service.ComputerService;

@RestController
public class ComputerController {

	@Autowired
	private ComputerService computerService;

	@GetMapping("/computers")
	public Page<Computer> getAllComputers(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size, @RequestParam(defaultValue = "id") String sortBy) {

		return computerService.getAllComputers(page, size, sortBy);
	}
}