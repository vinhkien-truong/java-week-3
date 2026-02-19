package polymorphism.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create abstract class Shape with method draw().
 2. Create subclasses Circle, Rectangle, Triangle → each overrides draw().
 3. Store them in a List<Shape> and loop through to call draw().
*/

public abstract class Shape
{
     public abstract void draw();
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

class Circle extends Shape {
     @Override
     public void draw() {
          System.out.println("Drawing a Circle");
     }
}

class Rectangle extends Shape {
     @Override
     public void draw() {
          System.out.println("Drawing a Rectangle");
     }
}

class Triangle extends Shape {
     @Override
     public void draw() {
          System.out.println("Drawing a Triangle");
     }
}

