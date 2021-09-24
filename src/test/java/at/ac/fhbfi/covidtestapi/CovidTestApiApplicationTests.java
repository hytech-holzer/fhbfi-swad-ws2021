package at.ac.fhbfi.covidtestapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.PostConstruct;

@SpringBootTest
class CovidTestApiApplicationTests {

    @Autowired
    private MyCoronaClient myCoronaClient;

    @Test
    void contextLoads() {
    }


    @Test
    public void init() {
        myCoronaClient.buttonClicked();
    }
}
