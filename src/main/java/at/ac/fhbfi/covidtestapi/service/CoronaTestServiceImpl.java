package at.ac.fhbfi.covidtestapi.service;

import at.ac.fhbfi.covidtestapi.entity.CoronaTest;
import at.ac.fhbfi.covidtestapi.entity.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoronaTestServiceImpl implements CoronaTestService {

    @Override
    public void saveNewCoronaTest(Person person, CoronaTest coronaTest) {
        log.info("saving corona test...");
    }
}
