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
    private static final String SUM_PATH = "/sum/2/3";
    private static final String MINUS_PATH = "/minus/10/7";
    private static final String DIV_PATH = "/div/15/3";
    private static final String MULTIPLY_PATH = "/multiply/5/2";


    @BeforeEach
    void setAll() {
        mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
    }

    @Test
    void whenHelloThenSuccess() throws Exception {
        mockMvc.perform(get(WELCOME_PATH))
                .andExpect(status().isOk());
    }

    @org.junit.Test
    void whenSumResultThenSuccess() throws Exception {
        when(mainService.sum(anyInt(), anyInt())).thenReturn(777);
        mockMvc.perform(get(SUM_PATH))
                .andExpect(status().isOk());
    }

    @org.junit.Test
    void whenMinusResultThenSuccess() throws Exception {
        when(mainService.minus(anyInt(), anyInt())).thenReturn(777);
        mockMvc.perform(get(MINUS_PATH))
                .andExpect(status().isOk());
    }

    @org.junit.Test
    void whenDivResultThenSuccess() throws Exception {
        when(mainService.div(anyInt(), anyInt())).thenReturn(777);
        mockMvc.perform(get(DIV_PATH))
                .andExpect(status().isOk());
    }

    @org.junit.Test
    void whenMultiplyResultThenSuccess() throws Exception {
        when(mainService.multiply(anyInt(), anyInt())).thenReturn(777);
        mockMvc.perform(get(MULTIPLY_PATH))
                .andExpect(status().isOk());
    }
}