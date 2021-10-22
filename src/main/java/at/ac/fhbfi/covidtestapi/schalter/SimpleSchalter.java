package at.ac.fhbfi.covidtestapi.schalter;

public class SimpleSchalter implements Schalter {

    private final Schaltobjekt schaltobjekt;

    public SimpleSchalter(Schaltobjekt schaltobjekt) {
        this.schaltobjekt = schaltobjekt;
    }

    @Override
    public void schalten() {
        schaltobjekt.schalten();
    }
}
