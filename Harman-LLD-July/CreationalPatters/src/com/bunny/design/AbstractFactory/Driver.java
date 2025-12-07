package com.bunny.design.AbstractFactory;

public class Driver {
    public static void main(String[] args){
//        DominoesPizzaFactory factory= new DominoesPizzaFactory() ;
//        PizzahutPizzaFactory pizzahutPizzaFactory= new PizzahutPizzaFactory();
//        System.out.println(factory.getPizza(PizzaType.Veg).getName());
//        System.out.println(pizzahutPizzaFactory.getPizza(PizzaType.Veg).getName());

        IPizzaFactory dominosPizzaFactory = FactoryProvider.
                getPizzaFactory(PizzaFactoryType.DOMINOS);
        IPizzaFactory PizzahutFactory = FactoryProvider.
                getPizzaFactory(PizzaFactoryType.PIZZAHUT);
        System.out.println(dominosPizzaFactory.getPizza(PizzaType.Veg).getName());
        System.out.println(PizzahutFactory.getPizza(PizzaType.Veg).getName());
    }
}
