package at.ac.fhbfi.covidtestapi.schalter;

public class Main {

    public static void main(String[] args) {
	    Schaltobjekt wohnzimmerLicht = new Licht();
        Schaltobjekt badezimmerLicht = new Licht();
        Schaltobjekt kuschelOfen = new Elektrokamin();
        Schalter schalter1 = new SimpleSchalter(wohnzimmerLicht);
        Schalter multischalter = new MultiSchalter(wohnzimmerLicht, badezimmerLicht, kuschelOfen);

        System.out.println("Play with simple schalter");
        schalter1.schalten();
        schalter1.schalten();
        schalter1.schalten();

        System.out.println("Play with multi schalter");
        multischalter.schalten();
    }
}
