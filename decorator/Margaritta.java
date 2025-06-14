package decorator;

public class Margaritta implements BasePizzaInterface {
    @Override
    public int cost() {
        return 150; // Cost of Margaritta pizza
    }
    @Override
    public void showCost() {
        System.out.println("Cost of Margaritta pizza: " + cost());
    }
}
