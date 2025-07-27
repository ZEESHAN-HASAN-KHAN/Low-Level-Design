//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LruCache lru= LruCache.getInstance(4);
        lru.put(1,10);
        lru.put(2,20);
        lru.put(3,30);
        lru.put(4,40);
        lru.put(5,50);
        lru.print();
        lru.put(2,22);
        lru.getValue(4);
        System.out.println("==========================================");
        lru.print();
    }
}