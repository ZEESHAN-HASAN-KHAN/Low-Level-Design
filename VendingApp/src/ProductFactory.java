public class ProductFactory {
    public static Product getProduct(String productName,int price, int quantity)
    {
        return switch (productName) {
            case "Chips" -> new Chips(price, quantity);
            case "Chocolate" -> new Chocolate(price, quantity);
            default -> null;
        };
    }
}
