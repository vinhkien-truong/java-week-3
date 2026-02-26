package projects.zooManagementSystem;

public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Ooh ooh aah aah";
    }

    @Override
    String eat() {
        return "Eats bananas";
    }
}
