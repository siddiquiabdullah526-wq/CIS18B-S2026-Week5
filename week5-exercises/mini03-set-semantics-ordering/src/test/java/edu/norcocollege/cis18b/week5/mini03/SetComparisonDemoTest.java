package edu.norcocollege.cis18b.week5.mini03;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class SetComparisonDemoTest {

    @Test
    void outputShowsStableLinkedHashSetOrderAndTreeSetOrdering() {
        String output = captureMainOutput();

        assertTrue(output.contains("LinkedHashSet: [queue, stack, map, set, Queue]"));
        assertTrue(output.contains("TreeSet: [Queue, map, queue, set, stack]"));
    }

    @Test
    void caseInsensitiveSetTreatsQueueAndLowercaseQueueAsSameLogicalValue() {
        String output = captureMainOutput();

        assertTrue(output.contains("TreeSet (case-insensitive): [map, queue, set, stack]"));
    }

    private String captureMainOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
            SetComparisonDemo.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        return buffer.toString(StandardCharsets.UTF_8);
    }
}