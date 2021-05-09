package Playlist;

public class Song {
    private String title;
    private int minutes;

    public Song(String title, int minutes) {
        this.title = title;
        this.minutes = minutes;
    }

    public String getTitle() {
        return title;
    }

    public int getMinutes() {
        return minutes;
    }
}
