public class Player {
    private String id;
    private String name;
    private Sign sign;

    public Player(String id, String name, Sign sign) {
        this.id = id;
        this.name = name;
        this.sign = sign;
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

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }
}
