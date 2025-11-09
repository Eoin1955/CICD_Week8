package ie.atu.week7cicd;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository repo;
    public PersonService(PersonRepository repo) { this.repo = repo; }
    public Person create(Person p) { return repo.save(p); }
    public List<Person> findAll() { return repo.findAll(); }
    public Person findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Person not found"));
    }
}

