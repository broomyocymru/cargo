package profileservice.component.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import profileservice.domain.Person;

@Component
class PersonComponentImpl implements PersonComponent{

    @Autowired
    private PersonRepository personRepository;

    public void deleteAll(){
        personRepository.deleteAll();
    }

    public Person findByUsername(String username){
        return personRepository.findByUsername(username);
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

}
