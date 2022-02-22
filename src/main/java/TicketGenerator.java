import product.Product;

import java.util.ArrayList;
import java.util.List;

public class TicketGenerator {

    private final List<Product> products = new ArrayList<>();;

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getTotalPrice() {
        return products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
    }
}