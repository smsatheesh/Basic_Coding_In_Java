import java.util.*;

class Album {
	
	private String name;
	private ArrayList<Song> songs;
	
	public Album( String name ) {
		this.name = name;
		this.songs = new ArrayList<Song>();
	}
	
	public Song findSong( String title ) {
		
		for( Song song: songs ) {
			
			if( (song.getTitle()).equals( title ) )
				return song;
		}
		
		return null;
	}
	
	public boolean addSong( String title, double duration ) {
		
		if( findSong( title ) == null ) {
			
			songs.add( new Song( title, duration ) );
			return true;
		} 
		
		return false;
	}
	
	public ArrayList<Song> getSongs() {
		return this.songs;
	}
}