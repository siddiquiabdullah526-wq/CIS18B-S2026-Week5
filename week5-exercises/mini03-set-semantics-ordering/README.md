# Mini-Assignment 3: Set Semantics and Ordering

## Objective
Compare how `HashSet`, `LinkedHashSet`, and `TreeSet` behave with the same data.

## Primary Competency
Ordering and uniqueness tradeoffs across set implementations.

## Learning Objectives Alignment
Week 5 objectives 1 and 2.

## Estimated Time
30 to 35 minutes.

## Problem Statement
You are analyzing a list of submitted tags that contains duplicates and mixed ordering. Your program should load the same values into three set implementations and explain the differences in output and behavior.

## Requirements
Complete `SetComparisonDemo` so that it:

* starts from one source list containing duplicates
* loads the values into `HashSet`, `LinkedHashSet`, and `TreeSet`
* prints the contents of each set
* explains how each implementation handles order
* uses a comparator for at least one sorted view if the natural order is not the best classroom example

## Extension Challenge
Add a case-insensitive comparator and explain how comparator choice can affect what counts as a duplicate in a `TreeSet`.

## Self-Check

* Did your example show both uniqueness and ordering differences?
* Can you explain why `HashSet` output order should not be treated as reliable?

## Expected Output

```text
HashSet: [order may vary]
LinkedHashSet: [queue, stack, map, set]
TreeSet: [map, queue, set, stack]
```

## Run

```bash
mvn test
mvn exec:java
```

Use `mvn test` first for TDD. Tests verify ordering semantics for `LinkedHashSet`, `TreeSet`, and case-insensitive behavior.

## Rubric Focus

* Correct use of three set implementations
* Accurate explanation of ordering behavior
* Clear comparator reasoning when used