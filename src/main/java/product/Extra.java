package product;


import java.math.BigDecimal;

public class Extra implements BedlamProducts{
    private final BigDecimal price;
    private final String name;

    public Extra (BigDecimal price, String name) {
        this.price = price;
        this.name = name;
    }

    public BigDecimal getPrice() {
        return switch (name) {
            case "Básicos" -> price + 0.90;
            case "Gourmet" -> price + 1.20;
            case "Premium" -> price + 2.20;
            case "Salsa barbacoa" -> price + 1.00;
            case "Salsa picante" -> price + 0.90;
            case "Borde relleno de queso" -> price + 1.20;
            default -> price;
        };
    }





}
