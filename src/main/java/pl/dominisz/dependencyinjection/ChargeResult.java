package pl.dominisz.dependencyinjection;

import lombok.Data;

@Data
public class ChargeResult {

    private boolean successful;
    private String declineMessage;

}
