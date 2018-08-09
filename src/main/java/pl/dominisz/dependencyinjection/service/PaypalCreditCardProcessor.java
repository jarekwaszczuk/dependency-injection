package pl.dominisz.dependencyinjection.service;

import org.springframework.stereotype.Component;
import pl.dominisz.dependencyinjection.model.ChargeResult;
import pl.dominisz.dependencyinjection.model.CreditCard;
import pl.dominisz.dependencyinjection.exception.UnreachableException;

import java.math.BigDecimal;
import java.util.Random;

@Component
public class PaypalCreditCardProcessor implements CreditCardProcessor {

    private Random random = new Random();

    public PaypalCreditCardProcessor() {
        System.out.println("PayPalCreditCardProcessor created");
    }

    @Override
    public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
        System.out.println("Establishing connection to Paypal service...");
        System.out.println("Charging card " + creditCard.getNumber() + ", amount " + amount);

        int number  = random.nextInt(3);

        if(number==0){
            System.out.println("Card succesfull charged");
            return new ChargeResult(true, null);
        }else if(number==1){
            System.out.println("Charged decline");
            return new ChargeResult(false, "Insuffient funds");
        }else{
            System.out.println("Connection break");
            throw new UnreachableException("Connection break");
        }
    }

}
