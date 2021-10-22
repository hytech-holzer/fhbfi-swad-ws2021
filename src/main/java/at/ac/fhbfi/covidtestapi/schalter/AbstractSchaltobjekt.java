package at.ac.fhbfi.covidtestapi.schalter;

public abstract class AbstractSchaltobjekt implements Schaltobjekt {

    protected boolean isAn;

    protected abstract String getName();

    @Override
    public void schalten() {
        if (isAn) {
            System.out.printf("%s ausschalten\n", getName());
        } else {
            System.out.printf("%s anschalten\n", getName());
        }
        isAn = !isAn;
    }
}
