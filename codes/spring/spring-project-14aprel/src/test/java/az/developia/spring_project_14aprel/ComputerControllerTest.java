package az.developia.spring_project_14aprel;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.http.MediaType;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import az.developia.spring_project_14aprel.controller.ComputerController;
import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.service.ComputerService;

@WebMvcTest(ComputerController.class)
class ComputerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ComputerService computerService;

    @Test
    void getAllTest() throws Exception {

        when(computerService.getAll())
                .thenReturn(List.of());

        mockMvc.perform(get("/computers"))
                .andExpect((ResultMatcher) ( status()).isOk());

        verify(computerService).getAll();
    }

	@Test
    void addTest() throws Exception {

        Computer computer = new Computer();
        computer.setBrand("HP");
        computer.setModel("Pavilion");
        computer.setPrice(1200);

        when(computerService.add(any(Computer.class)))
                .thenReturn(computer);

        mockMvc.perform(post("/computers")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                        {
                            "brand": "HP",
                            "model": "Pavilion",
                            "price": 1200
                        }
                        """))
                .andExpect(status().isOk());

        verify(computerService).add(any(Computer.class));
    }

	@Test
    void deleteTest() throws Exception {

        doNothing().when(computerService).delete(1);

        mockMvc.perform(delete("/computers/1"))
                .andExpect((ResultMatcher) (status()).isOk());

        verify(computerService).delete(1);
    }
   
	private RequestBuilder delete(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}