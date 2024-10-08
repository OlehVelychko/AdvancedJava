package patterns.factory;

import patterns.factory.ConcretePizzaStore.ChicagoStylePizzaStore;
import patterns.factory.ConcretePizzaStore.NYStylePizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore cStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("**************");
        System.out.println("Alice ordered a " + pizza.getName() + "\n");

        pizza = cStore.orderPizza("cheese");
        System.out.println("**************");
        System.out.println("Rita ordered a " + pizza.getName() + "\n");
    }
}
