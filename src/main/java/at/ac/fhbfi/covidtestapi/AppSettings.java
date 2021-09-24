package at.ac.fhbfi.covidtestapi;

public class AppSettings {

    private static AppSettings instance = new AppSettings();

    private AppSettings() {

    }

    public static AppSettings getInstance() {
        return instance;
    }

    public int maxConnections() {
        return 10;
    }


}
