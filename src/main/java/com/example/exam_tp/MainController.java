package com.example.exam_tp;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("/")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Leonid Lunin Exam Task 11 variant");
    }


    @GetMapping("/{quarter}")
    public ResponseEntity<?> quarter(@PathVariable int quarter) {
        return ResponseEntity.ok("Quarter of this month: " + mainService.quarter(quarter));
    }


}

