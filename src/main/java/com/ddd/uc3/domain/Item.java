package com.ddd.uc3.domain;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Item {
    private Product product;
    private int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
