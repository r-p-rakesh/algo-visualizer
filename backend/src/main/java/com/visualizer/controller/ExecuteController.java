package com.visualizer.controller;

import com.visualizer.core.JavaExecutionEngine;
import com.visualizer.model.ExecutionStep;

import java.util.List;

public class ExecuteController {

    public List<ExecutionStep> run(String code) {
        JavaExecutionEngine service = new JavaExecutionEngine();
        return service.executeAndGetSteps(code);
    }
}
