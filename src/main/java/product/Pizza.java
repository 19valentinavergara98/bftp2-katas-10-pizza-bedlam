package product;

import java.math.BigDecimal;

public class Pizza implements BedlamProducts{
    private final BigDecimal price;
    private final String name;

    public Pizza (BigDecimal price, String name) {
        this.price = price;
        this.name = name;
    }

    public BigDecimal getPrice() {
        return switch (name) {
            case "Margherita" -> price + 9.30;
            case "Prosciutto" -> price + 12.00;
            case "Prosciutto e funghi" -> price + 12.50;
            case "4 Stagioni" -> price + 12.50;
            default -> price;
        };
    }





}