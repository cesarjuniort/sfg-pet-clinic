package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * The Owner POJO
 * Created By:   ctoribio
 * Created Date: 8/8/2018 - 1:52 PM
 */
public class Owner extends Person {
    private Set<Pet> pets;
}
