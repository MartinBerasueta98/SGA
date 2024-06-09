package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Flight {
    private String code;
    private Airplane airplane;
    private ArrayList<Employer>employers;
    private HashMap <Seat, Passanger> seats;
    private Integer occupation;
    private Location origen;
    private Location destiny;
    private String description;
    private String stateFlight;
    private String gate;

    public Flight() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    public HashMap<Seat, Passanger> getSeats() {
        return seats;
    }

    public void setSeats(HashMap<Seat, Passanger> seats) {
        this.seats = seats;
    }

    public Integer getOccupation() {
        return occupation;
    }

    public void setOccupation(Integer occupation) {
        this.occupation = occupation;
    }

    public Location getOrigen() {
        return origen;
    }

    public void setOrigen(Location origen) {
        this.origen = origen;
    }

    public Location getDestiny() {
        return destiny;
    }

    public void setDestiny(Location destiny) {
        this.destiny = destiny;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStateFlight() {
        return stateFlight;
    }

    public void setStateFlight(String stateFlight) {
        this.stateFlight = stateFlight;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }
}
