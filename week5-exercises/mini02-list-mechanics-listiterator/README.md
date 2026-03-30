# Mini-Assignment 2: List Mechanics and ListIterator

## Objective
Use `ListIterator` for safe bidirectional traversal and in-place list updates.

## Primary Competency
Safe list traversal and mutation with `ListIterator`.

## Learning Objectives Alignment
Week 5 objectives 1, 5, and 6.

## Estimated Time
30 to 35 minutes.

## Problem Statement
An agenda editor stores session steps in a list. You must walk forward through the list, rename one step, insert a reflection step after it, and then walk backward to print the final agenda in reverse order.

## Requirements
Complete `AgendaEditor` so that it:

* stores agenda items in a `List`
* uses `ListIterator` rather than index arithmetic for the main update logic
* replaces one target value with `set`
* inserts one new value with `add`
* prints the final list in forward order
* prints the final list in reverse order using the same `ListIterator`

## Extension Challenge
Allow the program to remove any agenda item labeled `Optional` during iteration without causing concurrent modification problems.

## Self-Check

* Did you avoid modifying the list directly inside an enhanced `for` loop?
* Can you explain why `ListIterator` is better than plain `Iterator` for this task?

## Expected Output

```text
Forward: [Intro, Live Demo, Reflection, Quiz]
Reverse: [Quiz, Reflection, Live Demo, Intro]
```

## Run

```bash
mvn test
mvn exec:java
```

Use `mvn test` first for TDD. A failing test indicates that `Optional` still appears after `applyEdits`.

## Rubric Focus

* Correct `ListIterator` usage
* Safe mutation logic
* Accurate forward and reverse traversal