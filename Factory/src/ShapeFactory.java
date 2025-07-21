public class ShapeFactory {
    public static Shape getType(String ShapeType)
    {
        if(ShapeType.equals("Square"))
        {
            return new Square();
        }
        if(ShapeType.equals("Rectangle")) {
            return new Rectangle();
        }
        System.out.println("Please Give Appropiate Shape Type");
        return null;
    }
}
