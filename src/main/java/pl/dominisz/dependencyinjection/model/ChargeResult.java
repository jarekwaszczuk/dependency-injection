package pl.dominisz.dependencyinjection.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChargeResult {

    private boolean successful;
    private String declineMessage;

}
