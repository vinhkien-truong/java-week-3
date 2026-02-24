package projects.playlist;

import java.util.Collections;
import java.util.List;

public class Playlist {
    private String name;
    private List<String> listSong;

    public Playlist(String name, List<String> listSong) {
        this.name = name;
        this.listSong = listSong;
    }

    public void addSong(String title) {
        if(!listSong.contains(title)){
            listSong.add(title);
            System.out.println("added");
        }
    }

    public void removeSong(String title) {
        listSong.remove(title);
    }

    public void shufflePlaylist(){
        Collections.shuffle(this.listSong);//https://stackoverflow.com/questions/19050524/reorder-a-list-to-randomize-its-order-in-java
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < listSong.size() && listSong.get(i) != null;i++) 
        {
            result += "top " + (i+1) + " :" + listSong.get(i) + "\n";
        }
        return result;
    }




}
