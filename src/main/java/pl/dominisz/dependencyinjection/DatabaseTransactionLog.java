package pl.dominisz.dependencyinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseTransactionLog implements TransactionLog {

    private ChargeResultRepository chargeResultRepository;

    private UnreachableExceptionRepository unreachableExceptionRepository;

    @Autowired
    public DatabaseTransactionLog(ChargeResultRepository chargeResultRepository, UnreachableExceptionRepository unreachableExceptionRepository){
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
