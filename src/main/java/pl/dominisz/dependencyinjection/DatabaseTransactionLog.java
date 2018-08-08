package pl.dominisz.dependencyinjection;


public class DatabaseTransactionLog implements TransactionLog {

    public DatabaseTransactionLog(){
        System.out.println("DatabaseTransactionLog created");
    }

    @Override
    public void logChargeResult(ChargeResult chargeResult) {
        System.out.println("Logged charge result "+ chargeResult);
    }

    @Override
    public void logConnectException(UnreachableException unreachableException) {
        System.out.println("Logged connection exception "+ unreachableException);
    }
}
