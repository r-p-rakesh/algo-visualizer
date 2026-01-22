package com.visualizer.model;

public class VariableState {

    private String name;
    private Object value;

    public VariableState(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
