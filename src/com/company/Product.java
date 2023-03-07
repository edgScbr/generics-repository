package com.company;

import java.util.Comparator;

public class Product extends RepositoryElement {

    private int stock;

    public Product(String name, int stock) {
        super(name);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    static final Comparator<Product> STOCK;

    static {
        STOCK = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getStock() == p2.getStock()) {
                    return 0;
                } else if (p1.getStock() > p2.getStock()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + getName() +
                " stock=" + stock +
                '}';
    }

    @Override
    public Comparator<Product> getComparatorByField(String field) {
        switch (field) {
            case "name":
                return (Comparator<Product>) super.getComparatorByField(field);
            case "stock":
                return STOCK;
            default:
                return null;
        }
    }


}
