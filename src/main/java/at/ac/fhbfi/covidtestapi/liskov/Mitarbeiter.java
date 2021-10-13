package at.ac.fhbfi.covidtestapi.liskov;

public abstract class Mitarbeiter {

    public final void getProjectDetail() {
        System.out.println("basic project details.");
        getProjectDetailSpecific();
    }

    protected abstract void getProjectDetailSpecific();

}
