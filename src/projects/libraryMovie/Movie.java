package projects.libraryMovie;

import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private List<Actor> actor;
    private Director director;

    public Movie(String title, String genre, List<Actor> actor, Director director) {
        this.title = title;
        this.genre = genre;
        this.actor = actor;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public Director getDirector() {
        return director;
    }

    
}
