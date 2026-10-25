package com.team.service;

import com.team.model.CalculationRequest;

public class CalculatorService {
    public int add(CalculationRequest request) {
        return request.firstNumber() + request.secondNumber();
    }

    public int subtract(CalculationRequest request) {
        return request.firstNumber() - request.secondNumber();
    }
}
