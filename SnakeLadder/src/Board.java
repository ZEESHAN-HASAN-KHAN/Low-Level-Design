public class Board {
    private int size;
    private static Board instance;
    public static  synchronized Board getInstance()
    {
        if(instance== null)
        {
            instance= new Board();
        }
        return instance;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Board()
    {

    }
    public Board(int size)
    {
        this.size=size;
    }
}

