package pl.dominisz.dependencyinjection.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.dominisz.dependencyinjection.model.ChargeResult;
import pl.dominisz.dependencyinjection.exception.UnreachableException;
import pl.dominisz.dependencyinjection.repository.ChargeResultRepository;
import pl.dominisz.dependencyinjection.repository.UnreachableExceptionRepository;

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
