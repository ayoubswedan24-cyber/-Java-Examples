package com.team.app;

import com.team.model.CalculationRequest;
import com.team.service.CalculatorService;

public class JavaTeamApp {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        CalculationRequest request = new CalculationRequest(10, 20);

        int result = calculatorService.add(request);

        System.out.println("Java team project is ready!");
        System.out.println(request.firstNumber() + " + " + request.secondNumber() + " = " + result);
    }
}
