package org.example;


import org.example.Pizzeria.Doge_pizza;
import org.example.Pizzeria.Toni_Pepperoni;
import org.example.Tools.Ordered_pizza;
import org.example.Tools.Pyszne_pl;

public class Main {
    public static void main(String[] args) {

        Doge_pizza doge = new Doge_pizza();
        Toni_Pepperoni toni = new Toni_Pepperoni();

        Ordered_pizza orderedPizza1 = new Ordered_pizza("Margerita", 2);
        Ordered_pizza orderedPizza2 = new Ordered_pizza("Pepperoni", 1);


        Pyszne_pl p = new Pyszne_pl();
        p.add_pizza(orderedPizza1);
        p.add_pizza(orderedPizza2);
        p.remove_pizza(orderedPizza1);

        System.out.println(doge.pizza_list());
        System.out.println(toni.pizza_list());

        p.order_pizza(toni);
        p.order_pizza(doge);

        p.removeOrders();

        p.add_pizza(new Ordered_pizza("mleko", 5));
        p.order_pizza(doge);

    }
}