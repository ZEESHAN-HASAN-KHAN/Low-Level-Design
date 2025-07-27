package Jumper;

public class SnakeStrategy implements Jumpers {
    private int startingPosition;
    private int endingPosition;

    @Override
    public String toString() {
        return "SnakeStrategy{" +
                "startingPosition=" + startingPosition +
                ", endingPosition=" + endingPosition +
                '}';
    }

    public SnakeStrategy(int startingPosition, int endingPosition) {
        this.startingPosition = startingPosition;
        this.endingPosition = endingPosition;
    }

    @Override
    public void setStartingPosition(int position) {
        this.startingPosition=position;
    }

    @Override
    public int getStartingPostion() {
        return startingPosition;
    }

    @Override
    public void setEndingPosition(int position) {
        this.endingPosition=position;
    }

    @Override
    public int getEndingPosition() {
        return endingPosition;
    }
}
