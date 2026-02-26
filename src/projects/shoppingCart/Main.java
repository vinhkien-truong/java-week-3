package projects.shoppingCart;
/*
    * Classes: `Product`, `Cart`, `User`.
    * A `Cart` **HAS-A List<Product>`.
    * Use `Map<Product, Integer>` for product quantities.
    * Features: add/remove products, calculate total price.
*/
public class Main {
    public static void main(String[] args) {
        User user = new User("Alice");
        Product p1 = new Product("Laptop", 432);
        Product p2 = new Product("Headphones", 200.01);
        user.getCart().addProduct(p1, 1);
        user.getCart().addProduct(p2, 2);
        System.out.printf("Total Price: %.2f%n", user.getCart().calculateTotalPrice());
        user.getCart().addProduct(p2, 3);
        user.getCart().removeProduct(p1);
        System.out.printf("Total Price after removing: %.2f%n", user.getCart().calculateTotalPrice());

    }
}
