package Jumper;

public class LadderStrategy implements Jumpers {
    private int startingPosition;
    private int endingPosition;
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

    @Override
    public String toString() {
        return "LadderStrategy{" +
                "startingPosition=" + startingPosition +
                ", endingPosition=" + endingPosition +
                '}';
    }

    public LadderStrategy(int startingPosition, int endingPosition) {
        this.startingPosition = startingPosition;
        this.endingPosition = endingPosition;
    }
}
