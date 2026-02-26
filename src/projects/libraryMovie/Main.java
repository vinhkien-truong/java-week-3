package projects.libraryMovie;

import java.util.List;

/*
Classes: Movie, Actor, Director.
Store movies in a Map<String, Movie> (key = movie title).
Features: add movies, search by genre, list movies by actor.
*/
public class Main {

    public static void main(String[] args) {
        Director director1 = new Director("Truong");
        Actor actor1 = new Actor("Vinh");
        Actor actor2 = new Actor("Kien");

        Movie movie1 = new Movie("Inception", "Sci-Fi", List.of(actor1, actor2), director1);

        System.out.println("Movie Title: " + movie1.getTitle());
        System.out.println("Genre: " + movie1.getGenre());
        System.out.println("Director: " + movie1.getDirector().getName());
        System.out.println("Actors:");
        for (Actor actor : movie1.getActor()) {
            System.out.println("- " + actor.getName());
        }
    }
    
}
