import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        Inventory inventory=Inventory.getInstance();
        Product chips= ProductFactory.getProduct("Chips",100,100);
        Product chocolate= ProductFactory.getProduct("Chocolate",500,10);

        inventory.productList.add(chips);
        inventory.productList.add(chocolate);

        SelectedProduct sp1= new SelectedProduct(chips,100);
       Order od= inventory.place(List.of(sp1),10000);
       System.out.println(od.toString());
       System.out.println(chips.getQuantity());

    }
}
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
