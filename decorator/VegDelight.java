package decorator;

public class VegDelight  implements BasePizzaInterface {
    @Override
    public int cost() {
        return 200; // Cost of Veg Delight pizza
    }
    
    @Override
    public void showCost() {
        System.out.println("Cost of Veg Delight pizza: " + cost());
    }

}
