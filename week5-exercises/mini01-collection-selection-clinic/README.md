# Mini-Assignment 1: Collection Selection Clinic

## Objective
Practice choosing the correct Java collection abstraction for a scenario and defending that choice.

## Primary Competency
Collection interface selection and API choice rationale.

## Learning Objectives Alignment
Week 5 objectives 1 and 2.

## Estimated Time
20 to 25 minutes.

## Problem Statement
You are given a set of short application scenarios such as attendance tracking, undo history, course lookup, and processing support tickets. For each scenario, choose the best collection type and explain why the alternatives are weaker fits.

## Requirements
Complete `CollectionSelectionClinic` so that it:

* evaluates at least five scenarios
* chooses from `List`, `Set`, `Map`, `Queue`, or `Deque`
* prints the chosen interface for each scenario
* prints a one-sentence justification for each choice
* includes at least one scenario where ordering matters
* includes at least one scenario where uniqueness matters

## Extension Challenge
Add a second recommendation for each scenario that names a likely implementation such as `ArrayList`, `LinkedHashSet`, or `ArrayDeque`, and justify that implementation choice.

## Self-Check

* Did you separate interface choice from implementation choice?
* Did each justification mention program behavior instead of personal preference?

## Expected Output

```text
Scenario: Attendance log
Best choice: List
Why: duplicates and arrival order both matter.

Scenario: Unique course codes
Best choice: Set
Why: duplicates should be rejected automatically.
```

## Run

```bash
mvn test
mvn exec:java
```

Use `mvn test` first for TDD. The test suite expects you to add one additional scenario beyond the provided starter examples.

## Rubric Focus

* Correctness of collection selection
* Quality of justification
* Clear, readable output