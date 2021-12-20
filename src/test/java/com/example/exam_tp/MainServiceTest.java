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
    void whenFirstQuarterThenSuccess() {
        int month = 2;

        String actualResult = mainService.quarter(month);
        String expectedResult = "first quarter";
        assertEquals(actualResult, expectedResult);
    }
    @Test
    void whenSecondQuarterThenSuccess() {
        int month = 4;

        String actualResult = mainService.quarter(month);
        String expectedResult = "second quarter";
        assertEquals(actualResult, expectedResult);
    }
    @Test
    void whenThirdQuarterThenSuccess() {
        int month = 9;

        String actualResult = mainService.quarter(month);
        String expectedResult = "third quarter";
        assertEquals(actualResult, expectedResult);
    }
    @Test
    void whenFourthQuarterThenSuccess() {
        int month = 12;

        String actualResult = mainService.quarter(month);
        String expectedResult = "fourth quarter";
        assertEquals(actualResult, expectedResult);
    }
}

