package pl.dominisz.dependencyinjection;

import java.math.BigDecimal;

public interface CreditCardProcessor {

    ChargeResult charge(CreditCard creditCard, BigDecimal order);

}
