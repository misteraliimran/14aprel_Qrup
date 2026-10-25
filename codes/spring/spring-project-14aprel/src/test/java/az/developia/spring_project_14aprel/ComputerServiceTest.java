package az.developia.spring_project_14aprel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.repository.ComputerRepository;
import az.developia.spring_project_14aprel.service.ComputerService;

@ExtendWith(MockitoExtension.class)
public class ComputerServiceTest {

    @Mock
    private ComputerRepository computerRepository;

    @InjectMocks
    private ComputerService computerService;

    @Test
    void shouldFindComputerById() {
        Computer computer = new Computer();
        computer.setId(1);
        computer.setBrand("Lenovo");

        when(computerRepository.findById( 1))
                .thenReturn(Optional.of(computer));

        Computer result = computerService.getById(1);

        assertNotNull(result);
        assertEquals("Lenovo", result.getBrand());

        verify(computerRepository).findById( 1);
    }

    @Test
    void shouldThrowExceptionWhenComputerNotFound() {

        when(computerRepository.findById( 1))
                .thenReturn(Optional.empty());

        assertThrows(
                ResourcesNotFoundException.class,
                () -> computerService.getById(1)
        );

        verify(computerRepository).findById( 1);
    }
}