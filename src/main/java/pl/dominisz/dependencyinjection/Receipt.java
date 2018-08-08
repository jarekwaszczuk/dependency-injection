package pl.dominisz.dependencyinjection;

import java.math.BigDecimal;

public class Receipt {

    private BigDecimal amount;
    private String message;

    static Receipt forSuccessfulCharge(BigDecimal amount){
        return null;
    }

    static Receipt forDeclinedCharge(String message){
        return null;
    }

    static Receipt forSystemFailure(String message){
        return null;
    }

}
