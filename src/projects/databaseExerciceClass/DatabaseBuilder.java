package projects.databaseExerciceClass;
public class DatabaseBuilder {
    private final Database db;
    private String dbMessage;
    
    public DatabaseBuilder(Database db){
        this.db = db;
    }

    public void fetchData() {
        this.dbMessage = "Starting fetch operation...";
        System.out.println(this.dbMessage);
        db.fetchData();
    }

    public String getDbMessage(){
        return this.dbMessage;
    }
}
