package pl.dominisz.dependencyinjection.service;

import pl.dominisz.dependencyinjection.model.PizzaOrder;

public interface DiscountService {

    void calculateDiscount(PizzaOrder pizzaOrder);
}
