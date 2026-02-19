package polymorphism.exercises;

/**
 TODO:
 1. Create class Animal with method eat() → "This animal eats food".
 2. Create subclasses Dog and Bird:
      - Dog: "The dog eats bones".
      - Bird: "The bird eats seeds".
 3. Test them in main().
*/

public class Animal
{
     public String eat() {
          return "This animal eats food";
     }
     
     public static void main(String[] args) {
          Animal animal = new Animal();
          Dog dog = new Dog();
          Bird bird = new Bird();
     
          System.out.println(animal.eat());
          System.out.println(dog.eat());
          System.out.println(bird.eat());
     }
}

class Dog extends Animal {
     @Override
     public String eat() {
          return "The dog eats bones";
     }
}

class Bird extends Animal {
     @Override
     public String eat() {
          return "The bird eats seeds";
     }
}    