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
        return this.value;
    }

    @GetMapping("/increment")
    public Integer increment() {
        value += 1;
        return value;
    }

    @GetMapping("/decrement")
    public Integer decrement() {
        value -= 1;
        return value;
    }
}
