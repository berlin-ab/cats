package cats;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GreetingRepository extends CrudRepository<Greeting, Long> {
    public List<Greeting> findAll();
}
