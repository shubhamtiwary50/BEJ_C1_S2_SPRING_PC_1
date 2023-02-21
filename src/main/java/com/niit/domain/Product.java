package com.niit.domain;

import java.util.Objects;

public class Product {

    private  int productId;
    private String productName;
    private double productPrice;
    private String productColor;

    public Product() {
    }

    public Product(int productId, String productName, double productPrice, String productColor) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productColor = productColor;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProductId() == product.getProductId() && Double.compare(product.getProductPrice(), getProductPrice()) == 0 && getProductName().equals(product.getProductName()) && getProductColor().equals(product.getProductColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), getProductName(), getProductPrice(), getProductColor());
    }


}
