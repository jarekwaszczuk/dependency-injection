package pl.dominisz.dependencyinjection;

public class PizzaOrderService {

    private final PizzaOrderRepository pizzaOrderRepository;

    private final IngredientsService ingredientsService;

    private final DiscountCalculator discountCalculator;

    private final UserService userService;

    public void add(PizzaOrder pizzaOrder){
        //TODO sprawdź składniki w ingredientsService
        //TODO wyszukaj użytkownika w userService
        //TODO wyznacz cenę zamówienia korzystając z discountCalculator
        //TODO zapisz zamównienie w pizzaOrderRepository
    }
}
