package pl.dominisz.dependencyinjection.service;

import pl.dominisz.dependencyinjection.model.ChargeResult;
import pl.dominisz.dependencyinjection.model.CreditCard;

import java.math.BigDecimal;

public interface CreditCardProcessor {

    ChargeResult charge(CreditCard creditCard, BigDecimal order);

}
