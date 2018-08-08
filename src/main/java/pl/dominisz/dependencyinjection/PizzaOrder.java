package pl.dominisz.dependencyinjection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class PizzaOrder {

    private BigDecimal amount;

}
