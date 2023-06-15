package javaPractice;
import java.util.*;

public class RecentlyPlayedStore {
    private int capacity;
    private Map<String, LinkedList<String>> store;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.store = new HashMap<>();
    }

    public void addSong(String userId, String song) {
        LinkedList<String> songs = store.getOrDefault(userId, new LinkedList<>());

        if (songs.size() == capacity) {
            songs.removeLast();
        }

        songs.addFirst(song);
        store.put(userId, songs);
    }

    public List<String> getRecentlyPlayedSongs(String userId) {
        return store.getOrDefault(userId, new LinkedList<>());
    }
}
