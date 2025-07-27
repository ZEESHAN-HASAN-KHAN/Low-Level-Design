import java.util.HashMap;
import java.util.Map;

public class LruCache {
    private static LruCache instance;
    private  int capacity;
    private Map<Integer,Node> map;
    private Node head;
    private Node tail;

    public static synchronized LruCache getInstance(int capacity)
    {
        if(instance==null)
        {
            instance=new LruCache(capacity);
        }
        return instance;
    }
    public void print()
    {
        Node curr= head.next;
        while(curr!=tail)
        {
            System.out.println("Key   "+ curr.getKey() +"   Value   "+ curr.getValue());
            curr=curr.next;
        }
    }
    private LruCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    void add(Node node)
    {
        Node temp=head.next;
        head.next=node;
        node.prev=head;
        node.next=temp;
        temp.prev=node;
    }
    void delete(Node node)
    {
        Node prev= node.prev;
        Node next= node.next;
        prev.next=next;
        next.prev=prev;
    }
    void put(int key, int value)
    {
        if(map.containsKey(key))
        {
            Node node= map.get(key);
            node.setValue(value);
            delete(map.get(key));
            add(map.get(key));
            return;
        }
        if(map.size()==capacity)
        {
            map.remove(tail.prev.getKey());
            delete(tail.prev);

        }
        Node newNode=new Node(key,value);
        map.put(key,newNode);
        add(newNode);
    }

    int getValue(int key)
    {
        if(map.containsKey(key))
        {
            int value=map.get(key).getValue();
            delete(map.get(key));
            add(map.get(key));
            return value;
        }
        return -1;
    }


}
