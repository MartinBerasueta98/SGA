package Model;

import java.util.ArrayList;

public class Airline {
    private String airlineName;
    private String IATAcode;
    private ArrayList<Airplane> airplanes;
    private String status;
    private String type;

    public Airline(String airlineName, String IATAcode, String status, String type) {
        this.airlineName = airlineName;
        this.IATAcode = IATAcode;
        this.airplanes = new ArrayList<>();
        this.status = status;
        this.type = type;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
}
