package pl.dominisz.dependencyinjection.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class PizzaOrder {

    private BigDecimal amount;

}
