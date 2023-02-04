package com.ddd.uc3.domain;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
