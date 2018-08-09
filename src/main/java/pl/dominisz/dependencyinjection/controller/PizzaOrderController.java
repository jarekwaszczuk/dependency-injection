package pl.dominisz.dependencyinjection.controller;

import org.springframework.stereotype.Controller;
import pl.dominisz.dependencyinjection.model.PizzaOrder;
import pl.dominisz.dependencyinjection.service.PizzaOrderService;

@Controller
public class PizzaOrderController {

    private final PizzaOrderService pizzaOrderService;

    public PizzaOrderController(PizzaOrderService pizzaOrderService) {
        this.pizzaOrderService = pizzaOrderService;
    }

    public void addOrder(PizzaOrder pizzaOrder){
        pizzaOrderService.add(pizzaOrder);
    }

}
