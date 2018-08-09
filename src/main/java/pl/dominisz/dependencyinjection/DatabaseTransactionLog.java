package pl.dominisz.dependencyinjection;


public class DatabaseTransactionLog implements TransactionLog {

    private ChargeResultRepository chargeResultRepository;

    private UnreachableExceptionRepository unreachableExceptionRepository;

    public DatabaseTransactionLog(){
        System.out.println("DatabaseTransactionLog created");
    }

    @Override
    public void logChargeResult(ChargeResult chargeResult) {
        System.out.println("Logged charge result "+ chargeResult);
        chargeResultRepository.save(chargeResult);
    }

    @Override
    public void logConnectException(UnreachableException unreachableException) {
        System.out.println("Logged connection exception "+ unreachableException);
        unreachableExceptionRepository.save(unreachableException);
    }
}
