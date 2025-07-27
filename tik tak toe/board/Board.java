package board;

import piece.Piece;

public class Board {
    public static final int SIZE = 3;
    public Piece[][] grid;

    public Board() {
        grid = new Piece[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = null;
            }
        }
    }

    public void addPiece(int row, int col, Piece piece) throws Exception {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            throw new Exception("Invalid position");
        }
        if (grid[row][col] != null) {
            throw new Exception("Position already occupied");
        }
        grid[row][col] = piece;
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] != null ? grid[i][j].getType().toString() : " ");
                if (j < SIZE - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < SIZE - 1) {
                System.out.println("-----");
            }
        }
    }
}
