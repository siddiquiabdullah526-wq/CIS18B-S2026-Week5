package edu.norcocollege.cis18b.week5.mini04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;

class DequeWorkbenchTest {

    @Test
    void fifoSectionProcessesUrgentThenRegularItemsInExpectedOrder() {
        String output = captureMainOutput();
        List<String> fifoLines = output.lines().filter(line -> line.startsWith("FIFO processed: ")).toList();

        assertEquals(List.of(
            "FIFO processed: urgent outage",
            "FIFO processed: import roster",
            "FIFO processed: email reminder"
        ), fifoLines);
    }

    @Test
    void lifoSectionIncludesAtLeastThreePopOperationsAfterTodo() {
        String output = captureMainOutput();
        long undoLines = output.lines().filter(line -> line.startsWith("Undo popped: ")).count();

        assertTrue(undoLines >= 3, "Expected at least three undo pops after completing the TODO.");
    }

    private String captureMainOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
            DequeWorkbench.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        return buffer.toString(StandardCharsets.UTF_8);
    }
}