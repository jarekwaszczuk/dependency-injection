package pl.dominisz.dependencyinjection;

import lombok.Getter;
import pl.dominisz.dependencyinjection.exception.UnreachableException;
import pl.dominisz.dependencyinjection.model.ChargeResult;
import pl.dominisz.dependencyinjection.service.TransactionLog;

import java.util.ArrayList;
import java.util.List;

public class TestingTransactionLog implements TransactionLog {

    @Getter
    private List<ChargeResult> chargeResults = new ArrayList<>();

    @Getter
    private List<UnreachableException> unreachableExceptions = new ArrayList<>();

    @Override
    public void logChargeResult(ChargeResult chargeResult) {

        chargeResults.add(chargeResult);
        System.out.println("Logged charge result " + chargeResult);
    }

    @Override
    public void logConnectException(UnreachableException unreachableException) {
        unreachableExceptions.add(unreachableException);
    }
}
