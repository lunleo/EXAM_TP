package com.example.exam_tp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
class MainServiceTest {

    MainService mainService = new MainService();

    @Test
    void whenSumThenSuccess() {
        int a = 2;
        int b = 3;

        int actualResult = mainService.sum(a, b);
        int expectedResult = 5;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void whenMinusThenSuccess() {
        int a = 10;
        int b = 7;

        int actualResult = mainService.minus(a, b);
        int expectedResult = 3;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void whenDivThenSuccess() {
        int a = 15;
        int b = 3;

        int actualResult = mainService.div(a, b);
        int expectedResult = 5;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void whenMultiplyThenSuccess() {
        int a = 5;
        int b = 2;

        int actualResult = mainService.multiply(a, b);
        int expectedResult = 10;
        assertEquals(actualResult, expectedResult);
    }
}

