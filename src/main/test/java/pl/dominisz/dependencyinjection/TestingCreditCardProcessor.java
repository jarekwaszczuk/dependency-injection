package pl.dominisz.dependencyinjection;

import pl.dominisz.dependencyinjection.model.ChargeResult;
import pl.dominisz.dependencyinjection.model.CreditCard;
import pl.dominisz.dependencyinjection.service.CreditCardProcessor;

import java.math.BigDecimal;

public class TestingCreditCardProcessor implements CreditCardProcessor {

    @Override
    public ChargeResult charge(CreditCard creditCard, BigDecimal order) {
        return new ChargeResult(true, null);
    }
}
