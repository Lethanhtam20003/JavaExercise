package Album;

public class Song {
	private String titleSong;
	private String actor;
	private String genre;

	public Song(String titleSong, String actor, String genre) {
		this.titleSong = titleSong;
		this.actor = actor;
		this.genre = genre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.titleSong + "," + this.actor + "," + this.genre + ",";
	}

	/**
	 * @return the actor
	 */
	public String getActor() {
		return actor;
	}

	public boolean checkAuthor(String author) {
		// TODO Auto-generated method stub
		return this.actor.equals(author);
	}

}
