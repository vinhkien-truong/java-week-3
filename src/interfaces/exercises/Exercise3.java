package interfaces.exercises;

/**
 * TODO:
 * Exercise 3:
 * Create two interfaces: Flyable and Swimmable, each with a method (fly(), swim()).
 * Implement them in classes: Bird (can fly), Fish (can swim), and Duck (can both fly & swim).
 * Test them in Exercise3 class.
 */
public class Exercise3
{
        public static void main(String[] args)
        {
            Bird bird = new Bird();
            Fish fish = new Fish();
            Duck duck = new Duck();
            
            bird.fly();
            fish.swim();
            duck.fly();
            duck.swim();
        }
}

interface Flyable
{
     void fly();
}

interface Swimmable
{
     void swim();
}

class Bird implements Flyable
{
     @Override
     public void fly()
     {
          System.out.println("The bird is flying");
     }
}

class Fish implements Swimmable
{
     @Override
     public void swim()
     {
          System.out.println("The fish is swimming");
     }
}

class Duck implements Flyable, Swimmable
{
     @Override
     public void fly()
     {
          System.out.println("The duck is flying");
     }

     @Override
     public void swim()
     {
          System.out.println("The duck is swimming");
     }
}