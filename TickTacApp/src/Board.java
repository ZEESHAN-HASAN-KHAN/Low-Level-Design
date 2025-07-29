public class Board {
    private Sign[][] board;

    public Board() {
        this.board = new Sign[3][3];
    }

    public Sign[][] getBoard() {
        return board;
    }

    public void setBoard(Sign[][] board) {
        this.board = board;
    }
}
