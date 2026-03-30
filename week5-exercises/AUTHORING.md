# Week 5 Exercise Authoring Guide

Use this guide when creating starter code for Week 5 or when adapting the exercise pattern for later weeks.

## Starter-code scaffolding rules

* Each mini should be its own Maven project unless the week is intentionally bundled as a multi-module exercise set.
* Include a `pom.xml`, `README.md`, and `src/main/java` for every mini.
* Include `src/test/java` for Mini 6 at minimum.
* Starter code should compile before students edit TODO sections.
* Leave TODO markers only where student decisions or implementation work are expected.
* Provide one obvious entry point class for runnable minis, usually `App` or a domain-specific `Demo` class.

## Naming conventions

* Folder format: `mini0X-topic-name`
* Package format: `edu.norcocollege.cis18b.week5.mini0X`
* Prefer descriptive class names such as `CollectionSelectionClinic`, `DequeWorkbench`, or `PriorityPlaylistIterator`.
* Keep public class names aligned with the mini objective.

## Acceptance criteria format

Every mini README should include:

* `Objective`
* `Primary Competency`
* `Learning Objectives Alignment`
* `Estimated Time`
* `Problem Statement`
* `Requirements`
* `Extension Challenge`
* `Self-Check`
* `Expected Output`
* `Run`
* `Rubric Focus`

## Expected output rules

* Provide at least one concrete sample output block for runnable minis.
* Keep output deterministic when grading depends on ordering.
* If a collection type has non-deterministic ordering, either switch to a deterministic implementation or state that output order may vary and should be normalized in tests.

## Testing expectations

* Minis 1 through 5 may rely on console output plus instructor spot checks.
* Mini 6 should include JUnit tests that verify traversal order and iterator behavior.
* For iterator-related tests, assert sequence order explicitly.
* Include at least one misuse or edge-case test when the mini teaches failure modes.

## Readability and scope guardrails

* One core skill per mini.
* One extension challenge per mini.
* Avoid adding unrelated framework setup or file I/O unless it directly supports the learning objective.
* Keep starter code small enough that students spend time reasoning about collections, not navigating boilerplate.

## Suggested test targets for capstone mini

* Mini 6: traversal order, repeated iteration behavior, empty collection behavior, and strategy-order differences

## Stretch activity policy

If a benchmarking extension is added later, mark it optional and separate it clearly from the graded requirements. JMH should never be required for Week 5 core completion.