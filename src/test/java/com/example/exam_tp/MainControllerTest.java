package com.example.exam_tp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MainControllerTest {
    @InjectMocks
    MainController mainController;

    @Mock
    MainService mainService;

    private MockMvc mockMvc;

    private static final String WELCOME_PATH = "/";
    private static final String QUARTER_PATH = "/2";



    @BeforeEach
    void setAll() {
        mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
    }

    @Test
    void whenHelloThenSuccess() throws Exception {
        mockMvc.perform(get(WELCOME_PATH))
                .andExpect(status().isOk());
    }

    @Test
    void whenReturnStringResultThenSuccess() throws Exception {
        when(mainService.quarter(anyInt())).thenReturn("Any string");
        mockMvc.perform(get(QUARTER_PATH))
                .andExpect(status().isOk());
    }
}