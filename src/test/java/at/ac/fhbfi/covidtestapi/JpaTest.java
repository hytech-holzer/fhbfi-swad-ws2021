package at.ac.fhbfi.covidtestapi;

import at.ac.fhbfi.covidtestapi.entity.CoronaTest;
import at.ac.fhbfi.covidtestapi.entity.Person;
import at.ac.fhbfi.covidtestapi.jpa.CoronaTestRepository;
import at.ac.fhbfi.covidtestapi.jpa.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JpaTest {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private CoronaTestRepository coronaTestRepository;
    @Test
    public void testPerson() {
        Person person = new Person();
        person.setName("Markus");
        Person person2 = new Person();
        person2.setName("Max");


        personRepository.save(person);
        personRepository.save(person2);
        System.out.println(personRepository.findAll().size());
        System.out.println(personRepository.count());
        personRepository.findAll().forEach(System.out::println);

        CoronaTest testA = new CoronaTest();
        coronaTestRepository.save(testA);

        person.getTests().add(testA);
        personRepository.save(person);




    }

}
