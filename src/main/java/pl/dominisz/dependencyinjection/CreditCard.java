package pl.dominisz.dependencyinjection;

import java.time.LocalDate;

public class CreditCard {

    private String number;
    private String firstName;
    private String lastName;
    private LocalDate expireDate;
    private String cvv;

    public String getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

}
