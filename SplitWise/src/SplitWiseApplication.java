import java.util.ArrayList;
import java.util.List;

public class SplitWiseApplication {
    private static  SplitWiseApplication instance;
    public static synchronized  SplitWiseApplication getInstance()
    {
        if(instance==null)
        {
            instance=new SplitWiseApplication();
        }

        return instance;
    }
    List<User> userList;
    List<Group> groupList;
    List<SplitBill> splitBillList;

    public SplitWiseApplication() {
        this.userList = new ArrayList<>();
        this.groupList = new ArrayList<>();
        this.splitBillList = new ArrayList<>();
    }

    public SplitBill createSplitBill(Group group, SplitStrategy splitStrategy)
    {
        SplitBill splitBil=new SplitBill(group,splitStrategy);
       double amount= splitBil.calculateSplitAmount();
        splitBil.setSplitAmount(amount);
        group.setSplitBill(splitBil);
        group.setSplitAmount(amount);
        group.getUserList().forEach((user -> user.getSplitBillList().add(splitBil)));
        splitBillList.add(splitBil);
        return splitBil;
    }

}
