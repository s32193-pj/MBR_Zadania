package org.example.Pizzeria;

import org.example.Pizza.Giuseppe;
import org.example.Pizza.Margerita;
import org.example.Pizza.Pepperoni;
import org.example.Pizza.Pizza;

import java.util.ArrayList;

public class Toni_Pepperoni implements Pizzeria{
    ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    public Toni_Pepperoni() {
        pizzas.add(new Margerita(1*1,1,"Margerita"));
        pizzas.add(new Pepperoni(2*1,1, "Pepperoni"));
        pizzas.add(new Giuseppe(8*1,1, "Giuseppe"));
        pizzas.add(new Margerita(1*2,2,"Margerita"));
        pizzas.add(new Pepperoni(2*2,2, "Pepperoni"));
        pizzas.add(new Giuseppe(8*2,2, "Giuseppe"));
        pizzas.add(new Margerita(1*3,3,"Margerita"));
        pizzas.add(new Pepperoni(2*3,3, "Pepperoni"));
        pizzas.add(new Giuseppe(8*3,3, "Giuseppe"));
    }

    @Override
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }
    public String pizza_list(){
        StringBuilder builder = new StringBuilder();
        for (Pizza pizza : pizzas) {
            builder.append(pizza.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}



