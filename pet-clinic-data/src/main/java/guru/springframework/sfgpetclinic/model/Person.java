package guru.springframework.sfgpetclinic.model;

/**
 * The Person POJO.
 * Created By:   ctoribio
 * Created Date: 8/8/2018 - 1:49 PM
 */
public class Person extends  BaseEntity{
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
