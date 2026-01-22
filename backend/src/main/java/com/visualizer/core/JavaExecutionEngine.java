package com.visualizer.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.visualizer.model.ExecutionStep;

public class JavaExecutionEngine {

    private List<ExecutionStep> steps = new ArrayList<>();

   public void execute(String code) {
    // Step 1
    Map<String, Object> vars1 = new HashMap<>();
    vars1.put("a", 5);

    steps.add(new ExecutionStep(
            1,
            vars1,
            "Initialized variable a"
    ));

    // Step 2
    Map<String, Object> vars2 = new HashMap<>();
    vars2.put("a", 5);
    vars2.put("b", 7);

    steps.add(new ExecutionStep(
            2,
            vars2,
            "Calculated b = a + 2"
    ));
}


    public List<ExecutionStep> getSteps() {
        return steps;
    }
public List<ExecutionStep> executeAndGetSteps(String code) {
    execute(code);
    return steps;
}

}
