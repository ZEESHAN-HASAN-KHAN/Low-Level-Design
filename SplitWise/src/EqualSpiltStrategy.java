public class EqualSpiltStrategy implements SplitBillStrategy {
    @Override
    public double calculateSplit(double totalAmount, int numberOfUser) {
        return totalAmount/numberOfUser;
    }
}
