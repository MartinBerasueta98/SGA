package Model;

import java.sql.Time;

public class AirportTicket {
    private String from;
    private String to;
    private Time bordingTime;
    private Person passanger;
    private Double price;


    public AirportTicket() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Time geBordingTime() {
        return bordingTime;
    }

    public void setBordingTime(Time abordingTime) {
        this.bordingTime = abordingTime;
    }

    public Person getPassanger() {
        return passanger;
    }

    public Time getBordingTime() {
        return bordingTime;
    }

    public void setPassanger(Person passanger) {
        this.passanger = passanger;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
