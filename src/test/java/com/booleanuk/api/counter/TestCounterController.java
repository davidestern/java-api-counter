package com.booleanuk.api.counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCounterController {

    @Test
    void shouldReturnInitialValueZero() {
        CounterController controller = new CounterController();
        assertEquals(0, controller.getCurrentValue());
    }

    @Test
    void shouldIncrementValue() {
        CounterController controller = new CounterController();
        assertEquals(1, controller.increment());
    }

    @Test
    void shouldDecrementValue() {
        CounterController controller = new CounterController();
        assertEquals(-1, controller.decrement());
    }
}
