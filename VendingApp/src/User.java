import java.util.List;

public class User {
    private String id;
    private String name;
    private double amount;
    private List<SelectedProduct> selectedProductList;

    public User(String id, String name, double amount, List<SelectedProduct> selectedProductList) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.selectedProductList = selectedProductList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<SelectedProduct> getSelectedProductList() {
        return selectedProductList;
    }

    public void setSelectedProductList(List<SelectedProduct> selectedProductList) {
        this.selectedProductList = selectedProductList;
    }
}
