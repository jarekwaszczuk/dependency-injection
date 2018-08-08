package pl.dominisz.dependencyinjection;

public class ChargeResult {

    private String declineMessage;

    boolean isSuccessful(){
        return false;
    }

    String getDeclineMessage(){
        return this.declineMessage;
    }

}
