package pl.dominisz.dependencyinjection;

public interface TransactionLog {

    void logChargeResult(ChargeResult chargeResult);

    void logConnectException(UnreachableException unreachableException);

}
