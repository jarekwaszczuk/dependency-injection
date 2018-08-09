package pl.dominisz.dependencyinjection.repository;

import org.springframework.stereotype.Repository;
import pl.dominisz.dependencyinjection.exception.UnreachableException;

@Repository
public class UnreachableExceptionRepository {

    public void save(UnreachableException unreachableException){

    }
}
