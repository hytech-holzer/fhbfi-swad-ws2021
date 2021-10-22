package at.ac.fhbfi.covidtestapi.schalter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiSchalter implements Schalter {

    private final List<Schaltobjekt> schaltobjektList = new ArrayList<>();

    public MultiSchalter(Schaltobjekt... schaltobjekts) {
        schaltobjektList.addAll(Arrays.asList(schaltobjekts));
    }

    @Override
    public void schalten() {
        schaltobjektList.forEach(Schaltobjekt::schalten);
    }
}
