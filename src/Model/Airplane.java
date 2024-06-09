package Model;

import java.util.ArrayList;

public class Airplane {
    private String registrationNumber;
    private String modelName;
    private ArrayList<Employer>employers;
    private Seat

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
