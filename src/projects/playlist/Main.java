package projects.playlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Artist a1 = new Artist("Kien");
        Song s1 = new Song("lol", a1);
        Song s2 = new Song("lol2", a1);
        Song s3 = new Song("lol3", a1);
        Playlist pl = new Playlist("top 15", new ArrayList<>(15));
        System.out.println("testtt");
        pl.addSong(s1.getSongTitle());
        pl.addSong(s1.getSongTitle());
        pl.addSong(s2.getSongTitle());
        pl.addSong(s3.getSongTitle());
        System.out.println(pl);
        pl.shufflePlaylist();
        System.out.println(pl);
        pl.removeSong(s1.getSongTitle());
        pl.removeSong("jzadugazdiuga");
        System.out.println(pl);
    }
}
