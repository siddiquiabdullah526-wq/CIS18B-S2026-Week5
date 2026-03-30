# Mini-Assignment 4: Queue and Deque Workbench

## Objective
Model FIFO and LIFO workflows using `ArrayDeque`.

## Primary Competency
Queue and deque modeling with `ArrayDeque`.

## Learning Objectives Alignment
Week 5 objectives 1 and 2.

## Estimated Time
25 to 30 minutes.

## Problem Statement
Build a small workflow simulator that shows how the same `ArrayDeque` can behave like a regular queue for help tickets and like a stack for undo actions.

## Requirements
Complete `DequeWorkbench` so that it:

* uses `ArrayDeque`
* demonstrates FIFO processing with `addLast` and `removeFirst`
* demonstrates LIFO behavior with `push` and `pop`
* prints the state of the deque after major operations
* includes a short explanation of why legacy `Stack` is not the preferred solution

## Extension Challenge
Add a priority insertion rule that places one urgent task at the front and explain how that changes the workflow semantics.

## Self-Check

* Did you clearly separate the queue example from the stack example?
* Can you explain why `Deque` is more flexible than a queue-only interface?

## Expected Output

```text
FIFO processed: import roster
FIFO processed: email reminder
Undo popped: rename file
Undo popped: insert checkpoint
```

## Run

```bash
mvn test
mvn exec:java
```

Use `mvn test` first for TDD. One test is designed to fail until you add another stack action and produce at least three LIFO pops.

## Rubric Focus

* Correct deque operations
* Clear distinction between FIFO and LIFO behavior
* Accurate explanation of API choice