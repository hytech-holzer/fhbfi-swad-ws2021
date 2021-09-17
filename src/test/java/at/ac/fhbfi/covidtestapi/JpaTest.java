package at.ac.fhbfi.covidtestapi;

import at.ac.fhbfi.covidtestapi.entity.Person;
import at.ac.fhbfi.covidtestapi.jpa.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JpaTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testPerson() {
        Person person = new Person();
        person.setName("Markus");



        personRepository.save(person);
        System.out.println(personRepository.findAll().size());
        System.out.println(personRepository.count());
    }

}
