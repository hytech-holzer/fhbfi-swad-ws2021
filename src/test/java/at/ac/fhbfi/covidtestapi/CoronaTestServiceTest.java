package at.ac.fhbfi.covidtestapi;

import at.ac.fhbfi.covidtestapi.jpa.PersonRepository;
import at.ac.fhbfi.covidtestapi.service.CoronaTestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
public class CoronaTestServiceTest {

    @Autowired
    private CoronaTestService coronaTestService;

    @Autowired
    private PersonRepository personRepository;

    @Test
    @Transactional
    public void testCreateNewPerson() {
        log.info("before saving new person.");
        personRepository.findAll().forEach(System.out::println);

        coronaTestService.saveNewPerson("Markus Holzer");

        log.info("after saving new person.");
        personRepository.findAll().forEach(System.out::println);
    }
}
