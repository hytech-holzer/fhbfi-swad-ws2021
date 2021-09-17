package at.ac.fhbfi.covidtestapi.jpa;

import at.ac.fhbfi.covidtestapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
