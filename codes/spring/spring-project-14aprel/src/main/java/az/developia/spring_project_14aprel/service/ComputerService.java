package az.developia.spring_project_14aprel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.repository.ComputerRepository;

@Service
public class ComputerService {

	@Autowired
	private ComputerRepository computerRepository;

	public List<Computer> findBooksByPriceRange(Double a, Double b) {
		return computerRepository.findBooksByPriceRange(a, b);
	}
}