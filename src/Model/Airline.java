package Model;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Airline {
    private String airlineName;
    private String IATAcode;
    private ArrayList<Airplane> airplanes;
    private ArrayList<Employer> employers;

    public Airline(String airlineName, String IATAcode) {
        setAirlineName(airlineName);
        setIATAcode(IATAcode);
        setAirplanes(new ArrayList<Airplane>());
        setEmployers(new ArrayList<Employer>());
    }

    public Airline(){}

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getIATAcode() {
        return IATAcode;
    }

    public void setIATAcode(String IATAcode) {
        this.IATAcode = IATAcode;
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }
    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Airline'{'airlineName=''{0}'', IATAcode=''{1}'', " +
                "airplanes={2}, employers={3}'}'", getAirlineName(), getIATAcode(), getAirplanes(), getEmployers());
    }
}
