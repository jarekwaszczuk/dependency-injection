package pl.dominisz.dependencyinjection.service;

import pl.dominisz.dependencyinjection.model.PizzaOrder;

public class SummerDiscountService implements DiscountService {

    public SummerDiscountService() {
        System.out.println("SummerDiscountService created");
    }

    @Override
    public void calculateDiscount(PizzaOrder pizzaOrder) {

    }
}
