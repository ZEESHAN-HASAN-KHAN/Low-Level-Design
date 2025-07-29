import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Inventory {
    private static Inventory instace;
    List<Product> productList;
    List<User> userList;
    List<Order> orderList;

    public static synchronized Inventory getInstance()
    {
        if(instace==null)
        {
            instace= new Inventory();
        }
        return instace;
    }
    public Inventory() {
        this.productList = new ArrayList<>();
        this.userList = new ArrayList<>();
        this.orderList = new ArrayList<>();
    }
    // create user, product list

    public Order place(List<SelectedProduct> selectedProducts,double amount)
    {
        double bill=0;
        for(SelectedProduct sp: selectedProducts)
        {
            if(sp.getProduct().getQuantity()>=sp.getQuantity())
            {
                bill+= sp.getProduct().getPrice()*sp.getQuantity();
            }
            else
            {
                System.out.println("This product+"+sp.getProduct()+" is not in  Quantity");
                throw new IllegalStateException("Not in Qunatity");
            }
        }
        if(bill>amount)
        {
            throw  new IllegalStateException("Insufficient Amount");
        }
        double change= amount-bill;
        Order od=new Order("1",new Date().getTime(),bill,selectedProducts);
        od.setChange(change);
        orderList.add(od);
        return od;
    }
}
