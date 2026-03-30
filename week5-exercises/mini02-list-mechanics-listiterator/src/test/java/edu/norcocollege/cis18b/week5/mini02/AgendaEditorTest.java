package edu.norcocollege.cis18b.week5.mini02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class AgendaEditorTest {

    @Test
    void applyEditsReplacesDemoAddsReflectionAndRemovesOptional() {
        List<String> agenda = new ArrayList<>(List.of("Intro", "Demo", "Optional", "Quiz"));

        AgendaEditor.applyEdits(agenda);

        assertEquals(List.of("Intro", "Live Demo", "Reflection", "Quiz"), agenda);
    }
}