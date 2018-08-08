package pl.dominisz.dependencyinjection;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        BillingService billingService = new CreditCardBillingService();

        PizzaOrder order = new PizzaOrder();
        order.setAmount(new BigDecimal(45));
        CreditCard creditCard = new CreditCard("4321432143214321", "Jarosław", "Waszczuk",
                LocalDate.of(2020,8,31), "012");

        Receipt receipt = billingService.chargeOrder(order,creditCard);

        System.out.println(receipt.toString());
    }
}
