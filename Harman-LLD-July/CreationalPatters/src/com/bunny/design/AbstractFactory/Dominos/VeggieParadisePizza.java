package com.bunny.design.AbstractFactory.Dominos;

import com.bunny.design.AbstractFactory.IPizza;

public class VeggieParadisePizza implements IPizza {
    @Override
    public String getName() {
        return "Veggie Paradise Pizza";
    }
}
