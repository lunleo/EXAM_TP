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
        return ResponseEntity.ok("MY WORK");
    }


    @GetMapping("/sum/{a}/{b}")
    public ResponseEntity<?> sum(@PathVariable int a, @PathVariable int b) {
        return ResponseEntity.ok("a +b = " + mainService.sum(a, b));
    }

    @GetMapping("/minus/{a}/{b}")
    public ResponseEntity<?> minus(@PathVariable int a, @PathVariable int b) {
        return ResponseEntity.ok(mainService.minus(a, b));
    }

    @GetMapping("/div/{a}/{b}")
    public ResponseEntity<?> div(@PathVariable int a, @PathVariable int b) {
        return ResponseEntity.ok(mainService.div(a, b));
    }

    @GetMapping("/multiply/{a}/{b}")
    public ResponseEntity<?> multiply(@PathVariable int a, @PathVariable int b) {
        return ResponseEntity.ok(mainService.multiply(a, b));
    }
}

