public class CardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay()
    {
        System.out.println("Card");
    }
    public void test()
    {
        System.out.println("Test");
    }
}
