package projects.playlist;

public class Song {
    private final String title;
    private final Artist singer;

    public Song (String title, Artist singer) {
        this.title = title;
        this.singer = singer;
    }
    
    public String getSongTitle() {
        return this.title;
    }

    public Artist geArtist(){
        return this.singer;
    }

    @Override
    public String toString() {
        return "Song : "+this.title +" | Artist : "+this.singer;
    }
}
