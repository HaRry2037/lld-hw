package com.bunny.design.Factory;

public class DriverClass {
    public static void main(String[] args){
        Pizza veggiePizza= PizzaFactory.
                getPizza(PizzaType.Veg);
        Pizza Margrita= PizzaFactory.
                getPizza(PizzaType.MARGERITA);




        IPizza veggieIPizza= PizzaFactory.
                getIPizza(PizzaType.Veg);
        System.out.println(veggiePizza);
        System.out.println(veggieIPizza);
    }
}
