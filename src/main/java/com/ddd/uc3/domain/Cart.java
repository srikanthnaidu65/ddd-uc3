package com.ddd.uc3.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Cart {
    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}
