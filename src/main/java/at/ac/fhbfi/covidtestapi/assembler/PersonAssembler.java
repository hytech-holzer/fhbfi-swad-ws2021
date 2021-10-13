package at.ac.fhbfi.covidtestapi.assembler;

import at.ac.fhbfi.covidtestapi.dto.PersonDTO;
import at.ac.fhbfi.covidtestapi.entity.Person;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Component
public class PersonAssembler extends AbstractAssembler<Person, PersonDTO> {
    static DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    @Override
    public PersonDTO assemble(Person source) {
        return PersonDTO
                .builder()
                .id(source.getId())
                .name(source.getName())
                .birthdate(source.getBirthDate() == null ? "" : df.format(source.getBirthDate()))
                .build();
    }

    @Override
    protected List<PersonDTO> applySort(List<PersonDTO> list) {
        return super.applySort(list);
    }
}
