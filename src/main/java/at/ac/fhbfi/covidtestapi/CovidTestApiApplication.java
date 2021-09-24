package at.ac.fhbfi.covidtestapi;

import at.ac.fhbfi.covidtestapi.service.CoronaTestService;
import at.ac.fhbfi.covidtestapi.service.CoronaTestServiceImpl;
import at.ac.fhbfi.covidtestapi.service.CoronaTestServiceProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication

public class CovidTestApiApplication {



    public static void main(String[] args) {
        SpringApplication.run(CovidTestApiApplication.class, args);

    }









}
