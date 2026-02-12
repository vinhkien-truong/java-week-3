package encapsulation.exercises;
import java.util.ArrayList;

/**
 TODO:
 1. Create a class ShoppingCart with:
      - private field items (ArrayList of Strings).
      - private field totalPrice (double).

 2. Add methods:
      - addItem(String item, double price) → adds item and increases total price.
      - removeItem(String item, double price) → removes item if it exists and decreases total price.
      - getTotalPrice() → returns current total.
      - getItems() → returns the list of items.

 3. Add validation:
      - No negative prices allowed.
      - If you try to remove an item that doesn't exist, print a message.

 4. Challenge:
      - Add a method applyDiscount(double percentage) → reduces total price by that percentage,
        but only if percentage is between 0 and 50.
*/

public class ShoppingCart
{
     // your code here
     private ArrayList<String> items;
     private double totalPrice;
     
     public ShoppingCart() {
          this.items = new ArrayList<>();
          this.totalPrice = 0.0;
     }
     
     public void addItem(String item, double price) {
          if (price >= 0) {
               items.add(item);
               totalPrice += price;
          } else {
               System.out.println("Negative price not allowed");
          }
     }
     
     public void removeItem(String item, double price) {
          if (items.remove(item)) {
               totalPrice -= price;
          } else {
               System.out.println("Item not found: " + item);
          }
     }
     
     public double getTotalPrice() {
          return totalPrice;
     }
     
     public ArrayList<String> getItems() {
          return new ArrayList<>(items); 
     }
     
     public void applyDiscount(double percentage) {
          if (percentage >= 0 && percentage <= 50) {
               totalPrice -= totalPrice * (percentage / 100);
          } else {
               System.out.println("Invalid discount percentage: " + percentage);
          }
     }

}
