package com.bunny.design.AbstractFactory.Dominos;


import com.bunny.design.AbstractFactory.IPizza;
import com.bunny.design.AbstractFactory.IPizzaFactory;
import com.bunny.design.AbstractFactory.PizzaType;

public  class DominoesPizzaFactory implements IPizzaFactory {
    @Override
    public  IPizza getPizza(PizzaType type){
       return switch (type){
            case Veg -> new VeggieParadisePizza();

            case MARGERITA-> new Margerita();

            default->throw new RuntimeException("Pizza Type not found");
        };
    }

}
