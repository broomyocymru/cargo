package profileservice.component.person;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
import profileservice.domain.Person;

@Repository
interface PersonRepository extends GraphRepository<Person> {
    Person findByUsername(String username);
}