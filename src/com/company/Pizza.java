package com.company;

import java.util.Arrays;

public class Pizza extends Product {
    final static double TAX = 0.1;

    public Pizza(String name, double price) {
        super(name, price);
    }


    @Override
    public double countPrice() {
        return  price + (price * TAX);
    }

}
