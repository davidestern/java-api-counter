package com.booleanuk.api.counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/counter")
public class CounterController {

    private int value = 0;

    @GetMapping("/value")
    public Integer getCurrentValue() {
        return null;
    }

    @GetMapping("/increment")
    public Integer increment() {
        return null;
    }

    @GetMapping("/decrement")
    public Integer decrement() {
        return null;
    }


}
