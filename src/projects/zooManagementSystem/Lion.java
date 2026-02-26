package projects.zooManagementSystem;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Roar";
    }

    @Override
    String eat() {
        return "Eats meat";
    }
    
}
