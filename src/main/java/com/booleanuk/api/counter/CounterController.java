package com.booleanuk.api.counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/counter")
public class CounterController {

    private int value = 0;

    private List<Counter> counterList;

    public CounterController() {
        this.counterList = List.of(new Counter("default", 0));
    }

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

    @GetMapping("/custom/{name}")
    public Integer createOrFindCounter(@PathVariable String name) {
        return null;
    }

    @GetMapping("/custom/{name}/increment")
    public Integer incrementCustomCounter(@PathVariable String name) {
        return null;
    }

    @GetMapping("/custom/{name}/decrement")
    public Integer decrementCustomCounter(@PathVariable String name) {
        return null;
    }

    // Getter for list
    public List<Counter> getCounterList() {
        return counterList;
    }
}
