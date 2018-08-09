package pl.dominisz.dependencyinjection.repository;

import org.springframework.stereotype.Component;
import pl.dominisz.dependencyinjection.exception.UnreachableException;

@Component
public class UnreachableExceptionRepository {

    public void save(UnreachableException unreachableException){

    }
}
