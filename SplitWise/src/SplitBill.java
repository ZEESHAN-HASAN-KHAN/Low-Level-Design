import java.util.List;
import java.util.UUID;

public class SplitBill {
    private String id;
    private String name;
    private Group group;
    private double splitAmount;
    private SplitStrategy splitStrategy;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public double getSplitAmount() {
        return splitAmount;
    }

    public SplitStrategy getSplitStrategy() {
        return splitStrategy;
    }



    public SplitBill(Group group, SplitStrategy splitStrategy) {
        this.id = "SPB"+UUID.randomUUID().toString();
        this.name = group.getName().toString();
        this.group = group;
        this.splitStrategy = splitStrategy;
    }

    public double calculateSplitAmount()
    {
       double amount= splitStrategy.splitAmount(group.getUserList(),group.getAmount());
       this.splitAmount=amount;
       System.out.println("SPlit AMount"+ amount);
       return amount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setSplitAmount(double splitAmount) {
        this.splitAmount = splitAmount;
    }

    public void setSplitStrategy(SplitStrategy splitStrategy) {
        this.splitStrategy = splitStrategy;
    }
}
