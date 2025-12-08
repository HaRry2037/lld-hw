package com.bunny.design.AbstractFactory;

import com.bunny.design.AbstractFactory.Pizzahut.DoubleCheeseMargerita;
import com.bunny.design.AbstractFactory.Pizzahut.VegExtraVagenza;

public class PizzahutPizzaFactory implements IPizzaFactory {

    public IPizza getPizza(PizzaType type){
        return switch (type){
            case Veg -> new VegExtraVagenza();

            case MARGERITA-> new DoubleCheeseMargerita();

            default->throw new RuntimeException("Pizza Type not found");
        };
    }


}
