package com.company;

import java.util.Arrays;

public class Sandwich extends Product{
    final static double TAX = 0.15;

    public Sandwich(String name, double price) {
        super(name, price);
    }

    @Override
    public double countPrice() {
       return  price + (price * TAX);
    }


}
