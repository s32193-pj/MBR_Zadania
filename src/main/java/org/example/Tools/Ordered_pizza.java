package org.example.Tools;

import lombok.Getter;
import lombok.Setter;
import org.example.Pizza.Pizza;
@Getter
@Setter
public class Ordered_pizza implements Pizza {
    String name;
    int size;

    public Ordered_pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
