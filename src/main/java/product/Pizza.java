package product;


public class Pizza implements BedlamProducts {
    private final String name;

    public Pizza(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return switch (name) {
            case "Prosciutto" -> 12.00;
            case "Prosciutto e funghi", "4 Stagioni" -> 12.50;
            default -> 9.30;
        };
    }
}
