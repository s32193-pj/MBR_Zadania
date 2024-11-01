package org.example.Pizza;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Margerita implements Pizza {
    int price;
    int size;
    String name;


}
