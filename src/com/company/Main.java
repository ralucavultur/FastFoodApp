package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("carbonara", 27.33);
        pizza.addSpice("tomato");
        pizza.addSpice("olives");
        pizza.addSpice("chicken");
        System.out.println(pizza.allSpices());
        System.out.println(pizza.countPrice());
        System.out.println(pizza.toString());

        Sandwich chickenSandwich = new Sandwich("Chicken Sandwich", 22.35);
        chickenSandwich.addSpice("lettuce");
        chickenSandwich.addSpice("tomato");
        chickenSandwich.addSpice("ketchup");
        System.out.println(chickenSandwich.allSpices());
        System.out.println(chickenSandwich.countPrice());
        System.out.println(chickenSandwich.toString());
    }
}
