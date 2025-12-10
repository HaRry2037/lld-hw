package com.bunny.design.Factory;

public class  PizzaFactory {
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
