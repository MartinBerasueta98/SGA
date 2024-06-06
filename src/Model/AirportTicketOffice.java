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

    public AirportTicket sellTicket(String from, String to, Time time, Gate gate, String seat, Double price) throws NoAvailableFromSaleException {
        if (isTicketAvailable(from, to, time, seat, gate)) {
            if (Airplane.hasVipSeat()) {
                price = additionalCost();
            }
            AirportTicket ticket = removeTicketFromStock(from, to, time, seat, gate);
            ticket.setPrice(price);
            return ticket;
        } else {
            throw new NoAvailableFromSaleException("This seat is not available");
        }
    }

    public boolean isTicketAvailable(String from, String to, Time time, String seat, Gate nro){
        String key = generateTicketKey(from, to, time, seat, nro);
        return ticketStock.containsKey(key);
    }

    public String generateTicketKey(String from, String to, Time time, String seat,  Gate nro){
        return from + "-" + to + "/" + time + "/" + nro + "/" + seat;
    }

    public AirportTicket removeTicketFromStock(String from, String to, Time time, String seat, Gate gate){
        String key = generateTicketKey(from, to, time, seat, gate);
        return ticketStock.remove(key);
    }

}
