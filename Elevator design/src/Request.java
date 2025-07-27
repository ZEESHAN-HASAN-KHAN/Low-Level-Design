import java.util.UUID;

public class Request {
    private String id;
    private int startFloor;
    private int endFloor;

    @Override
    public String toString() {
        return "Request{" +
                "id='" + id + '\'' +
                ", startFloor=" + startFloor +
                ", endFloor=" + endFloor +
                ", direction=" + direction +
                '}';
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    private Direction direction;

    public Request(String id, int startFloor, int endFloor) {
        this.id = "REQ"+ UUID.randomUUID().toString();
        this.startFloor = startFloor;
        this.endFloor = endFloor;
        if((endFloor-startFloor)>0)
        {
            this.direction=Direction.UP;
        }
        else
        {
            this.direction=Direction.DOWN;
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStartFloor() {
        return startFloor;
    }

    public void setStartFloor(int startFloor) {
        this.startFloor = startFloor;
    }

    public int getEndFloor() {
        return endFloor;
    }

    public void setEndFloor(int endFloor) {
        this.endFloor = endFloor;
    }
}
