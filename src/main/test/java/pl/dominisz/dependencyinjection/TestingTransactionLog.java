package pl.dominisz.dependencyinjection;

public class TestingTransactionLog implements TransactionLog {

    @Override
    public void logChargeResult(ChargeResult chargeResult) {

    }

    @Override
    public void logConnectException(UnreachableException unreachableException) {

    }
}
