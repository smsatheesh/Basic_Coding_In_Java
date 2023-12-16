import java.util.*;

public class Main
{	
	
	public static void main(String[] args) {

		Album album1 = new Album("Album 1");
		album1.addSong("Song 1", 3.5);
		album1.addSong("Song 2", 4.0);
		album1.addSong("Song 3", 2.5);

		Album album2 = new Album("Album 2");
		album2.addSong("Song 4", 3.0);
		album2.addSong("Song 5", 5.5);
		
		PlayList playlist = new PlayList();
		playlist.addSongToPlayList(album1.getSongs().get(0));
		playlist.addSongToPlayList(album2.getSongs().get(1));
		playlist.addSongToPlayList(album1.getSongs().get(2));
		playlist.addSongToPlayList(album2.getSongs().get(0));

		playlist.play();
	}
}