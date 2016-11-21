package profileservice.component.person;

import profileservice.domain.Person;

public interface PersonComponent {
    void deleteAll();
    Person findByUsername(String username);
    Person save(Person person);
}
