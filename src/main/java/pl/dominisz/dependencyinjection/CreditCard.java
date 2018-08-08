package pl.dominisz.dependencyinjection;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CreditCard {

    private String number;
    private String firstName;
    private String lastName;
    private LocalDate expireDate;
    private String cvv;

}
