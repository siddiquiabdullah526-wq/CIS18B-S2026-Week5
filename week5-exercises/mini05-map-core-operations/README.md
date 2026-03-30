# Mini-Assignment 5: Map Core Operations and Lambdas

## Objective
Practice key/value lifecycle operations, lambda updates, and map correctness reasoning.

## Primary Competency
Key/value lifecycle plus lambda-based map updates.

## Learning Objectives Alignment
Week 5 objectives 1, 3, and 4.

## Estimated Time
35 to 45 minutes.

## Problem Statement
An enrollment dashboard tracks course sections by section code. You need to add entries, update values with modern map operations, inspect entry views, and explain why mutable keys are dangerous.

## Requirements
Complete `EnrollmentMapDemo` so that it:

* creates a `Map` of section codes to enrollment counts
* performs insert, lookup, update, and removal operations
* iterates through `entrySet()` for reporting
* uses `merge` for at least one counting update
* uses `compute` or `replace` for at least one targeted update
* uses `forEach` for final report output
* demonstrates an immutable configuration map using `Map.of`
* includes a short comment or printed explanation about why mutable keys can break map lookup behavior

## Extension Challenge
Add a grouped report such as `Map<String, List<String>>` (for department to section codes) using `computeIfAbsent`.

## Self-Check

* Did you use `entrySet()` instead of repeatedly calling `get` for reporting?
* Did you use at least one lambda map operation (`merge`, `compute`, `replace`, or `forEach`)?
* Can you explain why a key used in a hash-based map should remain stable?

## Expected Output

```text
SEC-101 -> 32
SEC-102 -> 28
Removed SEC-099
Updated with merge/compute operations.
Defaults: {retryLimit=3, waitlistCap=10}
```

## Run

```bash
mvn test
mvn exec:java
```

Use `mvn test` first for TDD. One test fails until your output includes a mutable-key hazard explanation.

## Rubric Focus

* Correct map operations
* Correct lambda-based map updates
* Clear explanation of mutable-key hazard
* Readable reporting output