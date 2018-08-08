package pl.dominisz.dependencyinjection;

public class ChargeResult {

    private boolean successful;
    private String declineMessage;

    boolean isSuccessful(){
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    String getDeclineMessage(){
        return this.declineMessage;
    }

    public void setDeclineMessage(String declineMessage) {
        this.declineMessage = declineMessage;
    }


}
