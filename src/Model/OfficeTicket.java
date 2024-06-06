package Model;

public abstract class OfficeTicket {
    private Double price;
    private Double additionalCost;
    private Double vipSeat;

    OfficeTicket(){}

    public Double getPrice() {
        return price;
    }

    public Double getAdditionalCost() {
        return additionalCost;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAdditionalCost(Double additionalCost) {
        this.additionalCost = additionalCost;
    }

    public Double additionalCost(){
        return getPrice() + getAdditionalCost();
    }


}
