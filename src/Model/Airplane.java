package Model;

import java.util.ArrayList;

public class Airplane {
    private String registrationNumber;

    private ArrayList<Employer>employers;
    //private Seat
    private int capacity;
    private int maxSeatsPerRow;

    public Airplane(String registrationNumber, String modelName, boolean vipSeat) {
        this.registrationNumber = registrationNumber;
        this.modelName = modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Airplane addAirplane(){
        System.out.println("");

        return null;
    }
}
