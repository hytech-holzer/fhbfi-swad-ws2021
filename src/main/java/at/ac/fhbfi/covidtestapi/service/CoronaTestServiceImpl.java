package at.ac.fhbfi.covidtestapi.service;

import at.ac.fhbfi.covidtestapi.assembler.PersonAssembler;
import at.ac.fhbfi.covidtestapi.dto.PersonDTO;
import at.ac.fhbfi.covidtestapi.entity.CoronaTest;
import at.ac.fhbfi.covidtestapi.entity.Person;
import at.ac.fhbfi.covidtestapi.jpa.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class CoronaTestServiceImpl implements CoronaTestService {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonAssembler personAssembler;

    @Override
    public void saveNewCoronaTest(Person person, CoronaTest coronaTest) {
        log.info("saving corona test...");
    }

    @Override
    public List<PersonDTO> getAllPersons() {
        return personAssembler.assemble(personRepository.findAll());
    }

    @Override
    public void saveNewPerson(String name) {
        Person person = Person.builder()
                .name(name)
                .build();
        personRepository.save(person);
    }
}
