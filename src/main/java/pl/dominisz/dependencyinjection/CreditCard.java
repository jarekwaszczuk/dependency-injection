package pl.dominisz.dependencyinjection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CreditCard {

    private String number;
    private String firstName;
    private String lastName;
    private LocalDate expireDate;
    private String cvv;

}
