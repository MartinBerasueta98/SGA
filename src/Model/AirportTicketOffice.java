package Model;

import Exceptions.NoAvailableFromSaleException;

import java.sql.Time;
import java.util.HashMap;

public class AirportTicketOffice extends OfficeTicket {
    private HashMap <String, AirportTicket> reservedTickets;
    private HashMap<String, AirportTicket> ticketStock;

    public AirportTicketOffice() {
        super();
        this.reservedTickets = new HashMap<>();
        this.ticketStock = new HashMap<>();
    }

    public HashMap<String, AirportTicket> getReservedTickets() {
        return reservedTickets;
    }

    public HashMap<String, AirportTicket> getTicketStock() {
        return ticketStock;
    }

   /* public AirportTicket sellTicket(Flight flight,Time time, Seat seat, Double price, Passanger passanger) throws NoAvailableFromSaleException {
        if (isTicketAvailable(flight.getOrigen().getLocation(), flight.getDestiny().getLocation(), time, seat, flight.getGate())) {
            if (seat.getSeatType().getType() != "Economica") {
                price = additionalCost();
            }
            if(passanger.isOverweight()){

            }
            AirportTicket ticket = removeTicketFromStock(flight.getOrigen().getLocation(), flight.getDestiny().getLocation(), time, seat, flight.getGate());
            ticket.setPrice(price);
            return ticket;
        } else {
            throw new NoAvailableFromSaleException("This seat is not available");
        }
    }*/

    public boolean isTicketAvailable(String from, String to, Time time, Seat seat, String gate){
        String key = generateTicketKey(from, to, time, seat.getNro(), gate);
        return ticketStock.containsKey(key);
    }

    public String generateTicketKey(String from, String to, Time time, String seat,  String gate){
        return from + "-" + to + "/" + time + "/" + gate + "/" + seat;
    }

    public AirportTicket removeTicketFromStock(String from, String to, Time time, Seat seat, String gate){
        String key = generateTicketKey(from, to, time, seat.getNro(), gate);
        return ticketStock.remove(key);
    }

}
