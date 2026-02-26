package projects.zooManagementSystem;

import java.util.ArrayList;
import java.util.List;

/*
Abstract class: Animal (method makeSound()).
Subclasses: Lion, Monkey, Penguin.
Store animals in a List<Animal> (demonstrating polymorphism).
Features: feed animals, display zoo inventory.
*/
public class Main {
    public static void main(String[] args) {
        
        List<Animal> zooInventory = new ArrayList<>();
        zooInventory.add(new Lion("Simba"));
        zooInventory.add(new Monkey("Wukong"));
        zooInventory.add(new Penguin("Skipper"));

        for (Animal animal : zooInventory) {
            System.out.println(animal.getName() + " says: " + animal.makeSound());
            System.out.println(animal.getName() + " " + animal.eat());
            System.out.println();
        }
    }
}
