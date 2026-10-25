package az.developia.spring_project_14aprel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.repository.ComputerRepository;

@Service
public class ComputerService {

	@Autowired
	private ComputerRepository computerRepository;

	public Page<Computer> getAllComputers(int page, int size, String sortBy) {

		Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());

		return computerRepository.findAll(pageable);
	}

	public Computer getById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Computer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Computer add(Computer computer) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
}