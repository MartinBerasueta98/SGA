package Model;

import java.util.ArrayList;

public class Airline {
    private String airlineName;
    private String IATAcode;
    private ArrayList<Airplane> airplanes;

    public Airline(String airlineName, String IATAcode) {
        this.airlineName = airlineName;
        this.IATAcode = IATAcode;
        this.airplanes = new ArrayList<>();
    }

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

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
}
