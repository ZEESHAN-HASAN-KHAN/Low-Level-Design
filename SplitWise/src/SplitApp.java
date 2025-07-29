import java.util.ArrayList;
import java.util.List;

public class SplitApp {
    private static SplitApp instance;
    private List<User> userList;
    private List<Group> groupList;
    private List<SplitBill> splitBillList;
    public SplitApp()
    {
        this.userList= new ArrayList<>();
        this.groupList=new ArrayList<>();
        this.splitBillList=new ArrayList<>();
    }
    // create Groups
    public Group createGroup(String id, String name, List<User> users,double totalAmount)
    {
        Group g1=new Group(id, name, users,totalAmount);
        groupList.add(g1);
        return g1;
    }
    public User createUser(String id, String name)
    {
        User u1= new User(id, name);
        userList.add(u1);
        return u1;
    }
    public SplitBill createSplitBill(List<User> users, double amount, SplitBillStrategy splitBillStrategy)
    {
        SplitBill splitBill= new SplitBill(users,amount,splitBillStrategy);
        splitBill.calculateBill();
        users.stream().forEach(user -> user.getSplitBill().add(splitBill));
        return splitBill;

    }
    // create user
    // create SplitBill



    public static  synchronized  SplitApp getInstance()
    {
        if(instance==null)
        {
            instance= new SplitApp();
        }
        return instance;
    }

}
