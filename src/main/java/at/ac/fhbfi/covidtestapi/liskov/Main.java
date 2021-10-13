package at.ac.fhbfi.covidtestapi.liskov;

public class Main {

    public static void main(String[] args) {
        new Angestellter().getProjectDetail();
        new Freelancer().getProjectDetail();
    }
}
