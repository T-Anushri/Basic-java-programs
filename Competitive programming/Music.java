import java.util.*;
class Song {
    private String title;
    private String artist;
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    public void display(){
        System.out.println(title +" by " + artist);
    }
}
class MusicLibrary {
    private List<Song> songs;
    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added: " );
        song.display();
    }
    public void removeSong(Song song) {
        if (songs.remove(song)) {
            System.out.println("Removed: " );
            song.display();
        } else {
            System.out.println("Song not found" );
            song.display();
        }
    }
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
        } else {                                                       
            Random random = new Random();                                 
            int randomIndex = random.nextInt(songs.size());               
            Song randomSong = songs.get(randomIndex);             
            System.out.println("Playing random song: " );                     
            randomSong.display();
        }
    }
}
public class Music {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addSong(new Song("Song1", "Artist1"));
        musicLibrary.addSong(new Song("Song2", "Artist2"));
        musicLibrary.addSong(new Song("Song3", "Artist3"));
        musicLibrary.playRandomSong();
        musicLibrary.removeSong(new Song("Song2", "Artist2"));
        musicLibrary.playRandomSong();
    }
}
