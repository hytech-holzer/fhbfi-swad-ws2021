package at.ac.fhbfi.covidtestapi.service;

import at.ac.fhbfi.covidtestapi.entity.CoronaTest;
import at.ac.fhbfi.covidtestapi.entity.Person;

import java.util.List;

public interface CoronaTestService {

    void saveNewCoronaTest(Person person, CoronaTest coronaTest);

    void saveNewPerson(String name);

    List<Person> getAllPersons();

}
