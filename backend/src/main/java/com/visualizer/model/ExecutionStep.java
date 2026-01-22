package com.visualizer.model;

import java.util.Map;

public class ExecutionStep {

    private int lineNumber;
    private Map<String, Object> variables;
    private String explanation;

    public ExecutionStep(int lineNumber,
                         Map<String, Object> variables,
                         String explanation) {
        this.lineNumber = lineNumber;
        this.variables = variables;
        this.explanation = explanation;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public String getExplanation() {
        return explanation;
    }
}
