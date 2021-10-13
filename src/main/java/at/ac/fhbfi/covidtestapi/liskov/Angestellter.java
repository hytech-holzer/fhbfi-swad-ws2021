package at.ac.fhbfi.covidtestapi.liskov;

public class Angestellter extends Mitarbeiter {

    @Override
    protected void getProjectDetailSpecific() {
        System.out.println("angestellter project details.");
    }

}
