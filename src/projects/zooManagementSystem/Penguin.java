package projects.zooManagementSystem;

public class Penguin extends Animal {
    
    public Penguin(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Honk";
    }

    @Override
    String eat() {
        return "Eats fish";
    }
}
