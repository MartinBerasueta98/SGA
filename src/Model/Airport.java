package Model;

import Exceptions.AlreadyExistsException;
import Exceptions.EmptyAirlineException;
import Exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Airport {
    private TreeSet <Airline> airlines;
    private ArrayList<Person> employers;

    public Airport() {
        this.airlines = new TreeSet<>();
        this.employers = new ArrayList<>();
    }

    public TreeSet<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(TreeSet<Airline> airlines) {
        this.airlines = airlines;
    }

    public ArrayList<Person> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Person> employers) {
        this.employers = employers;
    }
    public void addAirline(String airlineName) throws NotFoundException, AlreadyExistsException, EmptyAirlineException {
        Airline airline = AviationStack.searchAirline(airlineName);
        if (airline != null) {
               airlineName = airline.getAirlineName();
               if (!getAirlines().contains(airlineName)) {
                   getAirlines().add(airline);
               } else {
                   throw new AlreadyExistsException("ERROR: This airline already exists");
               }
        }
    }
}
