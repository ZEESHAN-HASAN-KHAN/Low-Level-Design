import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //modification
    SplitWiseApplication splitWiseApplication=SplitWiseApplication.getInstance();
    User user1= new User("1","Zeeshan");
    User user2= new User("2"," Ram");
    User user3= new User("2"," Kalim");
        Group group1= new Group("1","PartyPayment", List.of(user2,user3),1000);

        user1.setGroups(group1);


       SplitBill splitBill= splitWiseApplication.createSplitBill(group1,new EqualSplitStrategy());
       for(SplitBill splitBill1:user2.getSplitBillList())
       {
           System.out.println(splitBill1.getName());
       }
       System.out.println(group1.toString());
    }
}