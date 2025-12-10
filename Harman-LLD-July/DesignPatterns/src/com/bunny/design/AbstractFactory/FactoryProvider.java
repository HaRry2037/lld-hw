package com.bunny.design.AbstractFactory;

import com.bunny.design.AbstractFactory.Dominos.DominoesPizzaFactory;

public class FactoryProvider {
    public static IPizzaFactory getPizzaFactory(PizzaFactoryType type){
        return switch (type){
            case DOMINOS -> new DominoesPizzaFactory();

            case PIZZAHUT -> new PizzahutPizzaFactory();

            default -> throw new RuntimeException("Invalid Arguement");

        };
    }
}
