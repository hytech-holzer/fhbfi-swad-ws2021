package at.ac.fhbfi.covidtestapi.rest;


import at.ac.fhbfi.covidtestapi.entity.CoronaTest;
import at.ac.fhbfi.covidtestapi.entity.Person;
import at.ac.fhbfi.covidtestapi.jpa.PersonRepository;
import at.ac.fhbfi.covidtestapi.service.CoronaTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/coronatest/")
@CrossOrigin
@Slf4j
public class CoronaTestRestService {

    @Autowired
    private CoronaTestService coronaTestService;
    @Autowired
    private PersonRepository personRepository;

    public void saveNewCoronaTest(Person person, CoronaTest coronaTest) {

    }

    public void saveNewPerson(String name) {

    }

    @GetMapping(value = "/persons")
    public List<Person> getAllPersons() {
        return coronaTestService.getAllPersons();
    }
    @GetMapping(value = "/person")
    public Person getPersonByName(@RequestParam("name") String name) {
        log.info("searching person : " + name);
        return personRepository.findByNameContainsIgnoreCase(name).get(0);
    }
}
