package com.bunny.design.AbstractFactory;

import com.bunny.design.Factory.*;
import com.bunny.design.Factory.IPizza;
import com.bunny.design.Factory.Pizza;
import com.bunny.design.Factory.VeggieParadisePizza;
import com.bunny.design.Factory.VeggiePizza;

public class PizzaFactory {
    public static Pizza getPizza(PizzaType type){
       return switch (type){
            case Veg -> new VeggiePizza();

            case MARGERITA-> new Margrita();

            default->throw new RuntimeException("Pizza Type not found");
        };
    }
    public static IPizza getIPizza(PizzaType type){
        return  switch (type){
            case Veg -> new VeggieParadisePizza();



            default ->   throw new RuntimeException("Pizza Type not found");

        };
    }
}
