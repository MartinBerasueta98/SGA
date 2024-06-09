package Model;

public class Passanger {
    private String nroPassport;
    private Luggage luggage;

    public Passanger(String nroPassport, Luggage luggage) {
        this.nroPassport = nroPassport;
        this.luggage = luggage;
    }

    public String getNroPassport() {
        return nroPassport;
    }

    public void setNroPassport(String nroPassport) {
        this.nroPassport = nroPassport;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public void setLuggage(Luggage luggage) {
        this.luggage = luggage;
    }

    public boolean isOverweight(){
        for (int i=0; i<luggage.getLuggage().size();i++) {
            if (getLuggage().getLuggage().get(i).)
        }
    }
}
