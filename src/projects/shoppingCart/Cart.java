package projects.shoppingCart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> products;

    public Cart() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        this.products.put(product, this.products.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
}
