package projects.databaseExerciceClass;


/*
We have different databases, Postgres, MySql, SQL Server, MongoDB
They all fetch data
Create a client(main method) for databases
But the databases can be interchangable.
while fetching data the database builder is adding a message before fetch data
we want to test if this message is written
*/
public class Main {
    public static void main(String[] args) {
        
        /*Database postgres = new Postgres();
        Database mysql = new Mysql();
        Database sqlServer = new SqlServer();
        Database mongoDb = new MongoDb();

        postgres.fetchData();
        mysql.fetchData();
        sqlServer.fetchData();
        mongoDb.fetchData(); */

        DatabaseBuilder db = new DatabaseBuilder(new Postgres());
        DatabaseBuilder db2= new DatabaseBuilder(new Mysql());
        DatabaseBuilder db3 = new DatabaseBuilder(new SqlServer());
        DatabaseBuilder db4 = new DatabaseBuilder(new MongoDb());
        if (db.getDbMessage() == null) {
            System.out.println("db mess empty");
        }
        db.fetchData();
        if (db.getDbMessage() != null) {
            System.out.println("db mess not empty");
        }
        db2.fetchData();
        db3.fetchData();
        db4.fetchData();
        
    }
}
