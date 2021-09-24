package at.ac.fhbfi.covidtestapi;

import at.ac.fhbfi.covidtestapi.service.CoronaTestService;
import at.ac.fhbfi.covidtestapi.service.CoronaTestServiceImpl;
import at.ac.fhbfi.covidtestapi.service.CoronaTestServiceProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoronaTestBeanConfig {
    @Bean
    public CoronaTestService getCoronaTestService() {
        return new CoronaTestServiceProxy(new CoronaTestServiceImpl());
    }
}
