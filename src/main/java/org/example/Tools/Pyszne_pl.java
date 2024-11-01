package org.example.Tools;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.Pizza.Pizza;
import org.example.Pizzeria.Pizzeria;

import java.util.ArrayList;
@NoArgsConstructor
@ToString
public class Pyszne_pl {
   ArrayList<Pizza> pizzaArrayList = new ArrayList<>();



    public void add_pizza(Ordered_pizza pizza) {
        pizzaArrayList.add(pizza);
    }

    public void remove_pizza(Ordered_pizza pizza) {
        pizzaArrayList.remove(pizza);
    }

    public void order_pizza(Pizzeria pizzeria){
        int checkout = 0;
        ArrayList<Pizza> pizzeria_pizza = pizzeria.getPizzas();
        for (Pizza pizza : pizzeria_pizza) {
            for (Pizza value : pizzaArrayList) {
                if (pizza.getSize() == value.getSize() && pizza.getName().equals(value.getName())) {
                    checkout += pizza.getPrice();
                }
            }
        }
        if(checkout > 0) {
            System.out.println("Checkout: " + checkout + "\nOrder successful!");
        }else{
            System.out.println("Order failed!");
        }
    }
    public void get_Ordered_pizza(){
        StringBuilder builder = new StringBuilder();
        for (Pizza pizza : pizzaArrayList) {
            builder.append(pizza.getSize()).append(" ").append(pizza.getName()).append("\n");
        }
        System.out.println(builder);
    }

    public void removeOrders(){
        pizzaArrayList.clear();
    }


}
