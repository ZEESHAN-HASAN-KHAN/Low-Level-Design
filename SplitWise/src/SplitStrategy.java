import java.util.List;

public interface SplitStrategy {


    double splitAmount(List<User> userList, double totalAmount);
}
