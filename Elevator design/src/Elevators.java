import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Elevators {
    private String id;
    private int currentFloor;
    private Direction direction;
    private List<Request> request;

    @Override
    public String toString() {
        return "Elevators{" +
                "id='" + id + '\'' +
                ", currentFloor=" + currentFloor +
                ", direction=" + direction +
                ", request=" + request +
                '}';
    }

    public Elevators(String id, int currentFloor, Direction direction, List<Request> request) {
        this.id = "ELV"+ UUID.randomUUID().toString();
        this.currentFloor = currentFloor;
        this.direction = direction;
        this.request = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public List<Request> getRequest() {
        return request;
    }

    public void setRequest(List<Request> request) {
        this.request = request;
    }
    public void addRequest(Request request1)
    {
        request.add(request1);
    }
}
