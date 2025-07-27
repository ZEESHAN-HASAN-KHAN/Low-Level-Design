import java.util.UUID;

public class Player {
    private String id;
    private String name;
    private int currentLocation;
    public Player(String id, String name) {
        this.id = "PLA"+ UUID.randomUUID().toString();
        this.name = name;
        this.currentLocation = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", currentLocation=" + currentLocation +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }
}
