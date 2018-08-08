package pl.dominisz.dependencyinjection;

import java.math.BigDecimal;

public class Receipt {

    private BigDecimal amount;
    private String message;

    public Receipt(BigDecimal amount) {
        this.amount = amount;
    }

    public Receipt(String message) {
        this.message = message;
    }

    public static Receipt forSuccessfulCharge(BigDecimal amount){
        return new Receipt(amount);
    }

    public static Receipt forDeclinedCharge(String message){
        return new Receipt(message);
    }

    public static Receipt forSystemFailure(String message){
        return new Receipt(message);
    }

}
