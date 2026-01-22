# Core Execution Flow — DSA Code Visualizer

## 1. Entry Point
- `Main.java` is used only for local testing.
- Real usage will come via Controller / API.

## 2. Execution Engine
- `JavaExecutionEngine` is the heart of the system.
- It accepts source code as input.
- It does NOT visualize or print.
- It only produces execution steps.

## 3. Execution Step
- Each `ExecutionStep` represents one moment in execution.
- Fields:
  - lineNumber → which line executed
  - variables → snapshot of all variables
  - explanation → human-readable reasoning

## 4. Flow
Code →
JavaExecutionEngine →
List<ExecutionStep> →
(UI / API / Visualizer)

## 5. Design Rule
Backend describes WHAT happened.
Frontend decides HOW to show it (UI / animation).
