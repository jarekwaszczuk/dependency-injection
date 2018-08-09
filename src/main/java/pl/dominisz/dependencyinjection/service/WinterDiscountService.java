package pl.dominisz.dependencyinjection.service;

import pl.dominisz.dependencyinjection.model.PizzaOrder;

public class WinterDiscountService implements DiscountService {

    public WinterDiscountService() {
        System.out.println("WinterDiscountService created");
    }

    @Override
    public void calculateDiscount(PizzaOrder pizzaOrder) {

    }
}
