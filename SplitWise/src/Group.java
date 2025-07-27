import java.util.List;
import java.util.UUID;

public class Group {
    private String id;
    private String name;

    private List<User> userList;
    private double amount;
    private SplitBill splitBill;
    private double splitAmount;

    public double getSplitAmount() {
        return splitAmount;
    }

    public void setSplitAmount(double splitAmount) {
        this.splitAmount = splitAmount;
    }

    public Group(String id, String name, List<User> userList, double amount) {
        this.id = "GP"+ UUID.randomUUID().toString();
        this.name = name;
        this.userList = userList;
        this.amount = amount;
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

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", userList=" + userList +
                ", amount=" + amount +
                ", splitBill=" + splitBill +
                ", splitAmount="+splitAmount+
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public SplitBill getSplitBill() {
        return splitBill;
    }

    public void setSplitBill(SplitBill splitBill) {
        this.splitBill = splitBill;
    }
}
