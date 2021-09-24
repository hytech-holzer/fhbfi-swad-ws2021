package at.ac.fhbfi.covidtestapi.jpa;

import at.ac.fhbfi.covidtestapi.entity.CoronaTest;
import at.ac.fhbfi.covidtestapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoronaTestRepository extends JpaRepository<CoronaTest, Long> {
}
