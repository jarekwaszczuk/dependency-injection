package pl.dominisz.dependencyinjection;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        CreditCardProcessor creditCardProcessor = new PaypalCreditCardProcessor();
        TransactionLog transactionLog = new DatabaseTransactionLog();

        BillingService billingService = new CreditCardBillingService(creditCardProcessor, transactionLog);

        PizzaOrder order = new PizzaOrder(new BigDecimal(45));
        CreditCard creditCard = CreditCard.builder()
                .number("4321432143214321")
                .firstName("Jarosław")
                .lastName("Waszczuk")
                .expireDate(LocalDate.of(2020,8,31))
                .cvv("012")
                .build();

        Receipt receipt = billingService.chargeOrder(order,creditCard);

        System.out.println(receipt.toString());
    }
}
