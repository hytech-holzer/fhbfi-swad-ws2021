package at.ac.fhbfi.covidtestapi.liskov;

public class Freelancer extends Mitarbeiter{

    @Override
    protected void getProjectDetailSpecific() {
        System.out.println("freelancer project details.");
    }



}
