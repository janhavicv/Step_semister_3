import java.util.Arrays;

class playlist {
    private String[] songs;
    private int count;
    playlist(int size) {
        songs = new String[size];
        count = 0;
    }

    void addSong(String song) {
        if (count < songs.length) {
            songs[count] = song;
            count++;
        } else {
            System.out.println("Playlist is full");
        }
    }

    String[] getSongs() {
        return Arrays.copyOf(songs, count);
    }

    int getSongCount() {
        return count;
    }

    public static void main(String[] args) {
        playlist p = new playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();

        System.out.println("Songs: " + Arrays.toString(copy));
        System.out.println("Count: " + p.getSongCount());

        copy[0] = "Hacked";

        System.out.println("After changing copy: "
                + Arrays.toString(p.getSongs()));
    }
}