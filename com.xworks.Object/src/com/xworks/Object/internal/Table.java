package com.xworks.Object.internal;

import java.util.Objects;

public class Table {
    private String brand;
    private String material;
    private int price;
    private String shape;

    public Table(String brand, String material, int price, String shape) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Table{brand='" + brand + "', material='" + material + "', price=" + price + ", shape='" + shape + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Table) {
            Table table = (Table) obj;
            if (Objects.equals(this.price, table.price)) {
                System.out.println("table is matching..");
                return true;
            }
        }
        return false;
    }
}