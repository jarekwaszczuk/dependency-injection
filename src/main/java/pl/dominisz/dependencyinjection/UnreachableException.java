package pl.dominisz.dependencyinjection;

public class UnreachableException extends RuntimeException {

    private String message;

    public String getMessage(){
        return null;
    }
}
