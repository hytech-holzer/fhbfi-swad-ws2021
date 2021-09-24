package at.ac.fhbfi.covidtestapi;

import at.ac.fhbfi.covidtestapi.entity.CoronaTest;
import at.ac.fhbfi.covidtestapi.entity.Person;
import at.ac.fhbfi.covidtestapi.service.CoronaTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCoronaClient {

    @Autowired
    private CoronaTestService coronaTestService;

    Person myFakePerson = Person.builder().build();
    CoronaTest myFakeTest = null;

    public void buttonClicked() {
        coronaTestService.saveNewCoronaTest(myFakePerson, myFakeTest);
    }

}
