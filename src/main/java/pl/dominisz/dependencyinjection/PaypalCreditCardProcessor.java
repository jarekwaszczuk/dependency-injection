package pl.dominisz.dependencyinjection;

import java.math.BigDecimal;

public class PaypalCreditCardProcessor implements CreditCardProcessor {

    @Override
    public ChargeResult charge(CreditCard creditCard, BigDecimal order) {
        return null;
    }
}
