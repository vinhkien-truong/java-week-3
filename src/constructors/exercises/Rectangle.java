package constructors.exercises;

/**
 TODO:
 1. Create class Rectangle with width and height.
 2. Add:
      - Constructor(width, height)
      - Constructor(width) → height defaults to width (square)
 3. Add methods getArea() and getPerimeter().
 4. Test both constructors.
*/

public class Rectangle
{
     private double width;
     private double height;

     public Rectangle(double width, double height) {
          this.width = width;
          this.height = height;
     }

     public Rectangle(double width) {
          this.width = width;
          this.height = width;
     }

     public double getArea() {
          return width * height;
     }

     public double getPerimeter() {
          return 2 * (width + height);
     }
}
