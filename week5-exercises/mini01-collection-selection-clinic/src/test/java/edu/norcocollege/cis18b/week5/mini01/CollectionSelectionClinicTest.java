package edu.norcocollege.cis18b.week5.mini01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class CollectionSelectionClinicTest {

    @Test
    void printsAtLeastSixScenariosAfterTodoIsCompleted() {
        String output = captureMainOutput();
        long scenarioLines = output.lines().filter(line -> line.startsWith("Scenario: ")).count();

        assertTrue(
            scenarioLines >= 6,
            "Expected at least six scenarios after completing the TODO extension."
        );
    }

    @Test
    void everyScenarioHasMatchingChoiceAndJustificationLines() {
        String output = captureMainOutput();

        long scenarioLines = output.lines().filter(line -> line.startsWith("Scenario: ")).count();
        long choiceLines = output.lines().filter(line -> line.startsWith("Best choice: ")).count();
        long whyLines = output.lines().filter(line -> line.startsWith("Why: ")).count();

        assertEquals(scenarioLines, choiceLines);
        assertEquals(scenarioLines, whyLines);
    }

    private String captureMainOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
            CollectionSelectionClinic.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        return buffer.toString(StandardCharsets.UTF_8);
    }
}