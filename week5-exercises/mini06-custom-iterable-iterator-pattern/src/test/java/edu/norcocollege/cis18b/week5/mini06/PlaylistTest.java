package edu.norcocollege.cis18b.week5.mini06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;

class PlaylistTest {

    @Test
    void defaultIteratorUsesInsertionOrder() {
        Playlist playlist = buildPlaylist();

        assertEquals(List.of("Intro", "Demo", "Quiz"), collectTitles(playlist.iterator()));
    }

    @Test
    void priorityIteratorUsesPriorityOrder() {
        Playlist playlist = buildPlaylist();

        assertEquals(List.of("Quiz", "Demo", "Intro"), collectTitles(playlist.priorityIterator()));
    }

    @Test
    void repeatedIterationStartsAtBeginningEachTime() {
        Playlist playlist = buildPlaylist();

        assertEquals(List.of("Intro", "Demo", "Quiz"), collectTitles(playlist.iterator()));
        assertEquals(List.of("Intro", "Demo", "Quiz"), collectTitles(playlist.iterator()));
    }

    private Playlist buildPlaylist() {
        Playlist playlist = new Playlist();
        playlist.add(new PlaylistItem("Intro", 1));
        playlist.add(new PlaylistItem("Demo", 2));
        playlist.add(new PlaylistItem("Quiz", 3));
        return playlist;
    }

    private List<String> collectTitles(Iterator<PlaylistItem> iterator) {
        List<String> titles = new ArrayList<>();
        while (iterator.hasNext()) {
            titles.add(iterator.next().getTitle());
        }
        return titles;
    }
}