package pl.dominisz.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.dominisz.dependencyinjection.model.PizzaOrder;
import pl.dominisz.dependencyinjection.repository.PizzaOrderRepository;

@Component
public class PizzaOrderService {

    private final PizzaOrderRepository pizzaOrderRepository;

    private final IngredientsService ingredientsService;

    private final DiscountCalculator discountCalculator;

    private final UserService userService;

    @Autowired
    public PizzaOrderService(PizzaOrderRepository pizzaOrderRepository, IngredientsService ingredientsService, DiscountCalculator discountCalculator, UserService userService) {
        this.pizzaOrderRepository = pizzaOrderRepository;
        this.ingredientsService = ingredientsService;
        this.discountCalculator = discountCalculator;
        this.userService = userService;
    }

    public void add(PizzaOrder pizzaOrder){
        //TODO sprawdź składniki w ingredientsService
        //TODO wyszukaj użytkownika w userService
        //TODO wyznacz cenę zamówienia korzystając z discountCalculator
        //TODO zapisz zamównienie w pizzaOrderRepository
    }
}
