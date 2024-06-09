package Model;

import Exceptions.AlreadyExistsException;
import Exceptions.EmptyAirlineException;
import Exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.HashMap;

public class Airport {
    private HashMap <String, ArrayList<Airplane>> airlines;
    private ArrayList<Person> employers;

    public Airport() {
        this.airlines = new HashMap<>();
        this.employers = new ArrayList<>();
    }

    public HashMap<String, ArrayList<Airplane>> getAirlines() {
        return airlines;
    }

    public void setAirlines(HashMap<String, ArrayList<Airplane>> airlines) {
        this.airlines = airlines;
    }

    public ArrayList<Person> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Person> employers) {
        this.employers = employers;
    }
    public void addAirline(String airlineName) throws NotFoundException, AlreadyExistsException, EmptyAirlineException {
        if (airlineName != null) {
            if (!airlines.containsKey(airlineName)){
                airlines.put(airlineName, new ArrayList<Airplane>());
            }else {
                throw new AlreadyExistsException("ERROR: This airline already exists");
            }
        }
    }
    public void addAirplane(String airlineName)throws NotFoundException{
        if(airlines.isEmpty()){
            if(airlines.containsKey(airlineName)){
                //airlines.put(airlineName,);
            }
        }
    }
}
