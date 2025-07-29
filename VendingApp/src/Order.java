import java.util.List;

public class Order {
    private String id;
    private long  createdAt;
    private double totalBill;
    private double change;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", createdAt=" + createdAt +
                ", totalBill=" + totalBill +
                ", change=" + change +
                ", selectedProductList=" + selectedProductList +
                '}';
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    List<SelectedProduct> selectedProductList;

    public Order(String id, long createdAt, double totalBill, List<SelectedProduct> selectedProductList) {
        this.id = id;
        this.createdAt = createdAt;
        this.totalBill = totalBill;
        for(SelectedProduct sp:selectedProductList)
        {
            sp.getProduct().setQuantity(sp.getProduct().getQuantity()- sp.getQuantity());
        }
        this.selectedProductList = selectedProductList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public List<SelectedProduct> getSelectedProductList() {
        return selectedProductList;
    }

    public void setSelectedProductList(List<SelectedProduct> selectedProductList) {
        this.selectedProductList = selectedProductList;
    }
}
