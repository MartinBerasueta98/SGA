package Model;

public class Seat {
    private String nro;
    private SeatType seatType;
    private String stock;


    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Seat: \n" + "Nro:\t" + getNro() +
                "Seat Type:" + getSeatType()+
                "Ocupation: " + getStock();
    }
}
