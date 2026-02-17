package composition.exercises;

/**
 TODO:
 1. Create class Processor with method processData().
 2. Create class Computer that HAS-A Processor.
 3. In main(), create a Computer and call processData() through it.
*/

public class Computer
{
    private Processor processor;
    public Computer() {
        this.processor = new Processor();
    }
    
    public void processData() {
         System.out.println("computer start processing data...");
        this.processor.processData();
    }
}

class Processor 
{
    public void processData() {
        System.out.println("Processing data...");
    }
}