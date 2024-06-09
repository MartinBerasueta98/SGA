package Model;



public enum SeatType {
    ECONOMICA ("Economica", 1000D),
    ECONOMICAPREMIUM ("Economica Premium", 1600D),
    EXECUTIVE ("Ejecutiva", 2000D),
    FIRSTCLASS ("Premium", 2500D);
    private final String type;
    private final Double price;

    SeatType(String type, Double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }
}
