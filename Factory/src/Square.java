public class Square implements Shape{



    @Override
    public int area(int a, int b) {
        System.out.println("Square Area is " + a*b);
        return a*b;
    }
}
