import java.util.List;

public class EqualSplitStrategy implements  SplitStrategy{


    @Override
    public double splitAmount(List<User> userList, double totalAmount) {
        int numberOfUser=userList.size();
        return totalAmount/numberOfUser;
    }
}
