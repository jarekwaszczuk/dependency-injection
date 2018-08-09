package pl.dominisz.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;
import java.time.LocalDate;

@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);

        BillingService billingService = applicationContext.getBean(BillingService.class);

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
