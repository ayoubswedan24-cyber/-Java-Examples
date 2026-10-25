package com.team.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.team.model.CalculationRequest;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    @Test
    void addShouldReturnTheSum() {
        CalculationRequest request = new CalculationRequest(10, 20);
        CalculatorService calculatorService = new CalculatorService();

        assertEquals(30, calculatorService.add(request));
    }
}
