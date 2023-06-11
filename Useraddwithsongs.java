package javaPractice;

public class Useraddwithsongs {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecentPlayedSongs store = new RecentPlayedSongs(5);

		store.addSong("Akshay", "Song A");
		store.addSong("Akshay", "Song B");
		store.addSong("Akshay", "Song C");
		store.addSong("Akshay", "Song D");
		store.addSong("Akshay", "Song E");
		store.addSong("Akshay", "Song F");
		store.addSong("Akshay", "Song G");

		store.addSong("Abhi", "Song X");
		store.addSong("Abhi", "Song Y");
		store.addSong("Abhi", "Song Z");

		System.out.println(store.getRecentlyPlayedSongs("Akshay"));
		System.out.println(store.getRecentlyPlayedSongs("Abhi"));
	}

}

