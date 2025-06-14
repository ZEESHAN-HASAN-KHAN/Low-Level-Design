package decorator;

public class Mushroom implements ToppingInterface {
    private BasePizzaInterface pizza;

    public Mushroom(BasePizzaInterface pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 50; // Adding cost of Mushroom topping
    }

    @Override
    public void showCost() {
        System.out.println("Cost of Veg Delight pizza with Mushroom topping: " + cost());
    }
    
}
