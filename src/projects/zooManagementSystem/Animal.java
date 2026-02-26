package projects.zooManagementSystem;

public abstract class Animal {
    abstract String makeSound();
    abstract String eat();

    private String name;    
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
