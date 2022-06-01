package ProDuctManager;

import java.io.Serializable;

public class Product implements Serializable {
    private String productId;
    private String productName;
    private String maker;
    private String price;

    public Product() {
    }

    public Product(String productId, String productName, String maker, String price) {
        this.productId = productId;
        this.productName = productName;
        this.maker = maker;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return productId +
                "," + productName +
                "," + maker +
                "," + price;
    }
}
