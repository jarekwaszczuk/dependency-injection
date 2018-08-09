package pl.dominisz.dependencyinjection;

public class PizzaOrderController {

    private final PizzaOrderService pizzaOrderService;

    public PizzaOrderController(PizzaOrderService pizzaOrderService) {
        this.pizzaOrderService = pizzaOrderService;
    }

    public void addOrder(PizzaOrder pizzaOrder){
        pizzaOrderService.add(pizzaOrder);
    }

}
