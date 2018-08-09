package pl.dominisz.dependencyinjection.service;

import pl.dominisz.dependencyinjection.model.ChargeResult;
import pl.dominisz.dependencyinjection.exception.UnreachableException;

public interface TransactionLog {

    void logChargeResult(ChargeResult chargeResult);

    void logConnectException(UnreachableException unreachableException);

}
