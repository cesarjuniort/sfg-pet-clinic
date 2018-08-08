package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Base entity for all POJOs
 * Created By:   ctoribio
 * Created Date: 8/8/2018 - 6:54 PM
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
