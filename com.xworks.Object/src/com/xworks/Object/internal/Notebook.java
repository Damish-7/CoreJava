package com.xworks.Object.internal;

import java.util.Objects;

public class Notebook {
    private String brand;
    private int numberOfPages;
    private String size;           // e.g., "A4", "A5"
    private boolean isRuled;

    public Notebook() {
    }

    public void setNotebook(String brand, int numberOfPages, String size, boolean isRuled) {
        this.brand = brand;
        this.numberOfPages = numberOfPages;
        this.size = size;
        this.isRuled = isRuled;
    }

    @Override
    public String toString() {
        return "Notebook{brand='" + brand + "', numberOfPages=" + numberOfPages + ", size='" + size + "', isRuled=" + isRuled + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Notebook) {
            Notebook other = (Notebook) obj;
            if (this.brand.equals(other.brand) && this.numberOfPages == other.numberOfPages) {
                System.out.println("Matching notebook brand and number of pages..");
                return true;
            }
        }
        return false;
    }
}
