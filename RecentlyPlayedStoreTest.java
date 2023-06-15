package javaPractice;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecentlyPlayedStoreTest {
    @Test
    public void testAddSongAndGetRecentlyPlayedSongs() {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        store.addSong("user1", "Song1");
        store.addSong("user1", "Song2");
        store.addSong("user1", "Song3");

        store.addSong("user2", "SongA");
        store.addSong("user2", "SongB");

        List<String> user1Songs = store.getRecentlyPlayedSongs("user1");
        assertEquals(Arrays.asList("Song3", "Song2", "Song1"), user1Songs);

        List<String> user2Songs = store.getRecentlyPlayedSongs("user2");
        assertEquals(Arrays.asList("SongB", "SongA"), user2Songs);
    }

    @Test
    public void testAddSongWithCapacityExceeded() {
        RecentlyPlayedStore store = new RecentlyPlayedStore(2);

        store.addSong("user1", "Song1");
        store.addSong("user1", "Song2");
        store.addSong("user1", "Song3");

        List<String> user1Songs = store.getRecentlyPlayedSongs("user1");
        assertEquals(Arrays.asList("Song3", "Song2"), user1Songs);
    }

    @Test
    public void testGetRecentlyPlayedSongsForNonexistentUser() {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        List<String> songs = store.getRecentlyPlayedSongs("nonexistentUser");
        assertNotNull(songs);
        assertTrue(songs.isEmpty());
    }
}
