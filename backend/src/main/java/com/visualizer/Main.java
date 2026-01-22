package com.visualizer;

import com.visualizer.core.JavaExecutionEngine;
import com.visualizer.model.ExecutionStep;

public class Main {
    public static void main(String[] args) {
        JavaExecutionEngine service = new JavaExecutionEngine();
        service.execute("int a = 5;");

        for (ExecutionStep step : service.getSteps()) {
            System.out.println("Line: " + step.getLineNumber());
            System.out.println("Vars: " + step.getVariables());
            System.out.println("Explanation: " + step.getExplanation());
            System.out.println("----");
        }
    }
}
