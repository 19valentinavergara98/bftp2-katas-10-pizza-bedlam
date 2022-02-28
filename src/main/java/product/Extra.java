package product;

public class Extra implements BedlamProducts{
    private final String name;


    public Extra (String name) {
        this.name = name;
    }

    public Double getPrice() {
        return switch (name) {
            case "Básicos", "Salsa picante" -> 0.90;
            case "Gourmet", "Borde relleno de queso" -> 1.20;
            case "Premium" -> 2.20;
            default -> 1.00;
        };
    }

}
