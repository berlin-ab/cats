package cats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {

    @Id
    @GeneratedValue
    private Long id;

    public String message;

    public Greeting() {

    }

    public Greeting(String message) {
        this.message = message;
    }
}
