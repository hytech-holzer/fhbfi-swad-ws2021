package at.ac.fhbfi.covidtestapi.service;

import at.ac.fhbfi.covidtestapi.entity.CoronaTest;
import at.ac.fhbfi.covidtestapi.entity.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class CoronaTestServiceProxy implements CoronaTestService {

    private final CoronaTestService coronaTestServiceImpl;

    @Override
    public void saveNewCoronaTest(Person person, CoronaTest coronaTest) {
        // do something...
        log.info("proxy begin");
        coronaTestServiceImpl.saveNewCoronaTest(person, coronaTest);
        // do something...
        log.info("proxy end");
    }
}
