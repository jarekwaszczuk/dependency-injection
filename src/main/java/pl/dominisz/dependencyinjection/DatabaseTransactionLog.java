package pl.dominisz.dependencyinjection;

public class DatabaseTransactionLog implements TransactionLog {

    @Override
    public TransactionLog logChargeResult(ChargeResult chargeResult) {
        return null;
    }

    @Override
    public TransactionLog logConnectException(Exception e) {
        return null;
    }
}
