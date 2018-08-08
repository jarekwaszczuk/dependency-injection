package pl.dominisz.dependencyinjection;

public interface TransactionLog {

    TransactionLog logChargeResult(ChargeResult chargeResult);

    TransactionLog logConnectException(Exception e);
}
