package javaPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecentPlayedSongs {
    private final int initialCapacity;
    private Map<String, Deque<String>> recentlyPlayed;

    public RecentPlayedSongs(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.recentlyPlayed = new HashMap<>();
    }

    public void addSong(String userId, String song) {
        Deque<String> songs = recentlyPlayed.getOrDefault(userId, new ArrayDeque<>());
        if (songs.size() == initialCapacity) {
            songs.removeLast();
        }
        songs.addFirst(song);
        recentlyPlayed.put(userId, songs);
    }

    public List<String> getRecentlyPlayedSongs(String userId) {
        return new ArrayList<>(recentlyPlayed.getOrDefault(userId, new ArrayDeque<>()));
    }


}

