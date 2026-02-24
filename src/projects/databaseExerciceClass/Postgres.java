package projects.databaseExerciceClass;

public class Postgres implements Database {
    @Override
    public void fetchData() {
        System.out.println("Fetching data from Postgres database...");
    }
    
}
