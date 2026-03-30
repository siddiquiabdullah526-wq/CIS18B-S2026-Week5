# Week 5 Exercises: Collections, Iterators, and Advanced Data Structure Choices

This package contains 6 mini-assignments on Java Collections, iterators, and practical data structure decision-making.

Each assignment has its own folder, starter-code expectations, and local README.

## Suggested package naming

Use the package names already included in the starter files.

If starter files are generated later, use this pattern:

`edu.norcocollege.cis18b.week5.mini0X`

## General submission expectations

* Complete the TODOs in each assignment.
* Keep class names and package names unchanged unless your instructor says otherwise.
* Make sure each assignment compiles before submission.
* For every mini, start with `mvn test` and use failures to drive your TODO implementation.
* For runnable demos, also run `mvn exec:java` after tests pass.
* Include short written justification when an assignment asks you to defend an API or implementation choice.

## Async pacing guidance

* Mini 1: 20 to 25 minutes
* Mini 2: 30 to 35 minutes
* Mini 3: 30 to 35 minutes
* Mini 4: 25 to 30 minutes
* Mini 5: 35 to 45 minutes
* Mini 6: 50 to 70 minutes

## Grading use

* Minis 1 through 4 are formative practice.
* Mini 5 is bridge practice.
* Mini 6 is the summative mini-assessment.
* All minis are individual by default.

## Rubric focus for every mini

* Correctness: the program behaves as required.
* API choice rationale: the student can explain why a collection or iterator approach fits the problem.
* Code quality and readability: names, structure, and control flow are clear.

## Folders

1. `mini01-collection-selection-clinic`
   Primary competency: collection interface selection and justification
   Learning objectives: 1, 2

2. `mini02-list-mechanics-listiterator`
   Primary competency: safe list traversal and mutation with `ListIterator`
   Learning objectives: 1, 5, 6

3. `mini03-set-semantics-ordering`
   Primary competency: ordering and uniqueness tradeoffs across set implementations
   Learning objectives: 1, 2

4. `mini04-queue-deque-workbench`
   Primary competency: queue and deque modeling with `ArrayDeque`
   Learning objectives: 1, 2

5. `mini05-map-core-operations`
   Primary competency: key/value lifecycle plus lambda-based map updates
   Learning objectives: 1, 3, 4

6. `mini06-custom-iterable-iterator-pattern`
   Primary competency: custom `Iterable` design and iterator strategy comparison
   Learning objectives: 5, 6, 7, 8

## Self-check before submission

1. Can you explain why your chosen collection type is appropriate?
2. Are your collection mutations safe for the traversal style you used?
3. Did you preserve any required ordering behavior?
4. Does your output match the expected format in the mini README?
5. If the mini includes tests, do they pass locally with `mvn test`?

## TDD workflow for this week

1. Run `mvn test` before editing code and read the failing assertion messages.
2. Implement one TODO step.
3. Run `mvn test` again.
4. Repeat until all tests pass, then run `mvn exec:java` for output checks.

## Instructor and TA notes

See `AUTHORING.md` in this folder for starter-code rules, naming conventions, acceptance criteria, and testing expectations.