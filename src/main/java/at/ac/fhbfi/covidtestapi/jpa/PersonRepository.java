package at.ac.fhbfi.covidtestapi.jpa;

import at.ac.fhbfi.covidtestapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {


    List<Person> findByNameContainsIgnoreCase(String name);

}
