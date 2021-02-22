package com.company;

import java.util.Arrays;

public abstract class Product {
    String name;
    double price;
    String[] spices;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.spices = new String[10];
    }

    public void addSpice(String spice) {
        for (int i = 0; i < spices.length; i++) {
            if (spices[i] == null) {
                spices[i] = spice;
                break;
            }
        }
    }

    public String allSpices() {
        
        StringBuilder output = new StringBuilder();
        for (String spice : this.spices) {
            if (spice != null) {
                output.append(spice).append(", ");
            }
        }
        if (!output.toString().equals("") && output.toString().trim().endsWith(",")) {
            output.replace(output.length() - 2, output.length(), "");
        } else {
            output.append("no spices");
        }

        return output.toString();
    }


    public abstract double countPrice();

    @Override
    public String toString() {

        StringBuilder output = new StringBuilder();
        output.append("Product: ");
        output.append(this.name).append(", ");
        output.append("price: ").append(countPrice()).append(", ");
        output.append("spices: ").append(allSpices());
        return output.toString();
    }
}


