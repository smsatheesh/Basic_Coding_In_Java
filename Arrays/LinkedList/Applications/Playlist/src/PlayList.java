import java.util.*;

class PlayList {
	
	private LinkedList<Song> playList;
	private int count = 0;
	
	public PlayList() {
		this.playList = new LinkedList<Song>();
	}
	
	public boolean addSongToPlayList( Song song ) {
		return playList.add( song );
	}
	
	public void play() {
		
		if( playList.isEmpty() ) {
			System.out.println( "Playlist is empty..." );
			return;
		}
		
		Scanner scanner = new Scanner( System.in );
		boolean forwarded = true;
		boolean quit = false;
		
		do {
			
			printMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch( choice ) {
			
				case 0:
					quit = true;
					System.out.println( "Playlist ended...." );
					break;
					
				case 1:
					if( !forwarded ) {
						
						if( count < playList.size() )
							++count;
						forwarded = true;
					}
					if( count < playList.size() ) {
						
						System.out.print( "Now playing.... ");
						System.out.println( playList.get( count ) );
						count++;
					} else {
						
						System.out.println( "End of the playlist" );
						forwarded = false;
						count--;
					}
					break;
					
				case 2:
					if( forwarded ) {
						
						if( count > 0 ) {
							
							System.out.println( "Replaying " + playList.get( count - 1 ));
							forwarded = false;
						}
					} 
					
					if( count > 0 ) {
						
						System.out.println( "Now playing.... " + playList.get( count ));
						--count;
					} else {
						
						System.out.println( "Start of the playlist" );
						forwarded = true;
						count++;
					}
					break;
					
				case 3:
					
					if( count > 0 && count <= playList.size() ) {
						
						System.out.println( "Replaying " + playList.get( count - 1 ) );
					}
					break;
					
				case 4:
					printPlaylist();
					break;
					
				case 5:
					printMenu();
					break;
			}
		} while( !quit );
	}
	
	private void printMenu() {
		System.out.println("\nAvailable actions:\nPress");
		System.out.println("0 - to quit\n" +
		"1 - to play next song\n" +
		"2 - to play previous song\n" +
		"3 - to replay the current song\n" +
		"4 - to list songs in the playlist\n" +
		"5 - to print available actions");
	}
	
	private void printPlaylist() {
		
		System.out.println("Playlist:");
		for (Song song : playList)
			System.out.println(song);
	}
}