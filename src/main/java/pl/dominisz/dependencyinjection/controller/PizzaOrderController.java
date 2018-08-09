package pl.dominisz.dependencyinjection.controller;

import pl.dominisz.dependencyinjection.model.PizzaOrder;
import pl.dominisz.dependencyinjection.service.PizzaOrderService;

public class PizzaOrderController {

    private final PizzaOrderService pizzaOrderService;

    public PizzaOrderController(PizzaOrderService pizzaOrderService) {
        this.pizzaOrderService = pizzaOrderService;
    }

    public void addOrder(PizzaOrder pizzaOrder){
        pizzaOrderService.add(pizzaOrder);
    }

}
