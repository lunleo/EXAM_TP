package com.example.exam_tp;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public String doThat(String param1, String param2) {
        int a;

        try {
            a = Integer.parseInt(param1);
        } catch (NumberFormatException e) {
            return e.getMessage();
        }

        return "Result: " + a + param2;
    }

    public int sum(int a, int b){
        return a+b;
    }
    public int minus(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
}