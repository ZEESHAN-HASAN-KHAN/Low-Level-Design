public class Chocolate implements Product{
    private double price;
    private int quantity;

    public Chocolate(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
this.price=price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
this.quantity=quantity;
    }
}
