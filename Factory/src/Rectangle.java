public class Rectangle implements Shape{


    @Override
    public int area(int a, int b) {
       System.out.println("Rectangle Area is "+ a*b);
       return a*b;
    }
}
