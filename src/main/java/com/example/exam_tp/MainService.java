package com.example.exam_tp;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public String quarter(int month) {
        String quarter = new String();
        switch (month) {
            case 1:
            case 2:
            case 3:
                quarter = "first quarter";
                break;
            case 4:
            case 5:
            case 6:
                quarter = "second quarter";
                break;
            case 7:
            case 8:
            case 9:
                quarter = "third quarter";
                break;
            case 10:
            case 11:
            case 12:
                quarter = "fourth quarter";
                break;
        }
        return quarter;
    }
}