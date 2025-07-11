package com.example.ParcijalniJavaWEB3;



import com.example.ParcijalniJavaWEB3.controller.PolaznikController;
import com.example.ParcijalniJavaWEB3.dto.PolaznikDTO;
import com.example.ParcijalniJavaWEB3.service.PolaznikService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PolaznikControllerTest {
    @Mock
    private PolaznikService polaznikService;

    @InjectMocks
    private PolaznikController polaznikController;

    private MockMvc mockMvc;

    private final ObjectMapper objectMapper = new ObjectMapper();

    private List<PolaznikDTO> polaznici;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(polaznikController).build();

        // Initialize mock data
        PolaznikDTO article1 = new PolaznikDTO("ana", "Anic", " aaaaa");
        PolaznikDTO article2 = new PolaznikDTO("bbbb", "ccccc", "ddddddddd");
        polaznici = Arrays.asList(article1, article2);
    }



    @Test
    void testDeletePolaznik() {
        Long polaznikId = 1L;
        doNothing().when(PolaznikService).deletePolaznik(polaznikId);

        polaznikController.delete(polaznikId);


    }
}
