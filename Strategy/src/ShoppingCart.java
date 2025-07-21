public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    ShoppingCart(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }

    void purchase()
    {
        if(paymentStrategy!=null)
        {
            paymentStrategy.pay();
            return;
        }
        System.out.println("Please Choose the Payment Strategy");

    }
}
