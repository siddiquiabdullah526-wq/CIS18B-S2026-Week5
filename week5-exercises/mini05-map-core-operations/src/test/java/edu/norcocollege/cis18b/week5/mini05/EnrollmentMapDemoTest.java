package edu.norcocollege.cis18b.week5.mini05;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class EnrollmentMapDemoTest {

    @Test
    void outputShowsExpectedEnrollmentUpdatesAndGrouping() {
        String output = captureMainOutput();

        assertTrue(output.contains("SEC-101 -> 33"));
        assertTrue(output.contains("SEC-102 -> 28"));
        assertTrue(output.contains("Removed SEC-099"));
        assertTrue(output.contains("Defaults: "));
        assertTrue(output.contains("Grouped sections: {CIS=[SEC-101, SEC-102]}"));
    }

    @Test
    void outputIncludesMutableKeyHazardExplanationAfterTodo() {
        String output = captureMainOutput();

        assertTrue(
            output.contains("Mutable key hazard"),
            "Expected output to include a mutable-key hazard explanation after completing the TODO."
        );
    }

    private String captureMainOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
            EnrollmentMapDemo.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        return buffer.toString(StandardCharsets.UTF_8);
    }
}