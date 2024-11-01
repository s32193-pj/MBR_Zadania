package org.example.Pizzeria;

import org.example.Pizza.Giuseppe;
import org.example.Pizza.Margerita;
import org.example.Pizza.Pepperoni;
import org.example.Pizza.Pizza;

import java.util.ArrayList;

public class Doge_pizza implements Pizzeria {
    ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    public Doge_pizza() {
        pizzas.add(new Margerita(15*1,1,"Margerita"));
        pizzas.add(new Pepperoni(20*1,1, "Pepperoni"));
        pizzas.add(new Giuseppe(88*1,1, "Giuseppe"));
        pizzas.add(new Margerita(15*2,2,"Margerita"));
        pizzas.add(new Pepperoni(20*2,2, "Pepperoni"));
        pizzas.add(new Giuseppe(88*2,2, "Giuseppe"));
        pizzas.add(new Margerita(15*3,3,"Margerita"));
        pizzas.add(new Pepperoni(20*3,3, "Pepperoni"));
        pizzas.add(new Giuseppe(88*3,3, "Giuseppe"));
    }

    public String pizza_list(){
        StringBuilder builder = new StringBuilder();
        for (Pizza pizza : pizzas) {
            builder.append(pizza.toString());
            builder.append("\n");
        }
        return builder.toString();
    }

    @Override
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }
}
