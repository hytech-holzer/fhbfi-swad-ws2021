package at.ac.fhbfi.covidtestapi;

import at.ac.fhbfi.covidtestapi.entity.Person;
import at.ac.fhbfi.covidtestapi.jpa.PersonRepository;
import at.ac.fhbfi.covidtestapi.service.CoronaTestService;
import at.ac.fhbfi.covidtestapi.service.CoronaTestServiceImpl;
import at.ac.fhbfi.covidtestapi.service.CoronaTestServiceProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.GregorianCalendar;

@SpringBootApplication
public class CovidTestApiApplication {

    @Autowired
    private PersonRepository personRepository;


    public static void main(String[] args) {
        SpringApplication.run(CovidTestApiApplication.class, args);

    }



    @PostConstruct
    public void initTestData() {

        Calendar cal = GregorianCalendar.getInstance();
        cal.set(1982, Calendar.FEBRUARY, 10);
        personRepository.save(Person.builder().name("Markus Holzer").birthDate(cal.getTime()).build());
        personRepository.save(Person.builder().name("Doris").build());


    }







}
