package product;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;
    private String name;




    public Product(BigDecimal price, String name){
    this.price = price;
    this.name = name;}

        public BigDecimal getPrice() {return price;}

        public void setPrice() {this.price = price;}

        public String getName() {return name;}

        public void setName(String name) {this.name = name;}
}


