package at.ac.fhbfi.covidtestapi.assembler;

public interface Assembler<S, T> {

    T assemble(S source);

}
