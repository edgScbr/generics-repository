package com.company;

public class Product extends RepositoryElement {

    private int stock;

    public Product(String name, int stock) {
        super(name);
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + getName() +
                " stock=" + stock +
                '}';
    }
}
