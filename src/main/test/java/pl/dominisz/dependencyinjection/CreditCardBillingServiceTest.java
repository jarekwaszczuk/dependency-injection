package pl.dominisz.dependencyinjection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditCardBillingServiceTest {

    @Test
    void testCreditCardBillingService() {
        CreditCardProcessor creditCardProcessor = new TestingCreditCardProcessor();
        TestingTransactionLog transactionLog = new TestingTransactionLog();
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

        Assertions.assertEquals(new BigDecimal(45), receipt.getAmount());
        ChargeResult expectedResult = new ChargeResult(true, null);
        Assertions.assertEquals(1, transactionLog.getChargeResults().size());
        Assertions.assertEquals(expectedResult, transactionLog.getChargeResults().get(0));
    }

    //TODO dla przypadku DECLINE

    //TODO dla przypadku UNREACHABLE
}
