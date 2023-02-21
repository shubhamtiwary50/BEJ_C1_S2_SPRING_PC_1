package com.niit.domain;

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
}
