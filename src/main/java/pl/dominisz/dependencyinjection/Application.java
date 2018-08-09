package pl.dominisz.dependencyinjection;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        PizzaOrderRepository pizzaOrderRepository = new PizzaOrderRepository();
        IngredientsService ingredientsService = new IngredientsService();
        DiscountCalculator discountCalculator = new DiscountCalculator();
        UserService userService = new UserService();

        PizzaOrderService pizzaOrderService = new PizzaOrderService(pizzaOrderRepository, ingredientsService, discountCalculator, userService);
        PizzaOrderController pizzaOrderController = new PizzaOrderController(pizzaOrderService);

        CreditCardProcessor creditCardProcessor = new PaypalCreditCardProcessor();

        ChargeResultRepository chargeResultRepository = new ChargeResultRepository();
        UnreachableExceptionRepository unreachableExceptionRepository = new UnreachableExceptionRepository();

        TransactionLog transactionLog = new DatabaseTransactionLog(chargeResultRepository, unreachableExceptionRepository);

        BillingService billingService = new CreditCardBillingService(creditCardProcessor, transactionLog);

        PizzaOrder order = new PizzaOrder(new BigDecimal(45));
        CreditCard creditCard = CreditCard.builder()
                .number("4321432143214321")
                .firstName("Jarosław")
                .lastName("Waszczuk")
                .expireDate(LocalDate.of(2020, 8, 31))
                .cvv("012")
                .build();

        Receipt receipt = billingService.chargeOrder(order, creditCard);

        System.out.println(receipt.toString());
    }
}
