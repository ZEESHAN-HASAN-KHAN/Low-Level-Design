package tictactoe;

import java.util.Stack;

import board.Board;
import player.Player;

public class TicTacToeGame {
    private static volatile TicTacToeGame instance;
    private Board board;
    private Player playerA;
    private Player playerB;
    Stack<Player> playersTurn;
    private boolean gameOver = false;

    private TicTacToeGame() {
        board = new Board();
        playersTurn = new Stack<>();
    }

    public static TicTacToeGame getInstance() {
        synchronized (TicTacToeGame.class) {
            if (instance == null) {
                instance = new TicTacToeGame();
            }
        }
        return instance;
    }

    public void registerPlayer(Player player) throws Exception {
        if (player == null || player.getPiece() == null) {
            throw new IllegalArgumentException("Player or piece cannot be null");
        }
        if (this.playerA != null && this.playerB != null) {
            throw new IllegalStateException("Both players are already registered");
        }
        if (this.playerA == null && this.playerB == null) {
            instance.playerA = player;
            System.out.println("Player A registered with " + player.getPiece().getType());
            return;
        }

        if (this.playerA != null && this.playerB == null) {
            if (player.getPiece().getType() == piece.PieceType.O) {
                instance.playerB = player;
                System.out.println("Player B registered with " + player.getPiece().getType());
                return;
            } else {
                throw new IllegalArgumentException("Player A is already registered with X. Player B must be O.");
            }
        }
    }

    public void playMove(Player player, int row, int col) throws Exception {
        if (gameOver) {
            throw new IllegalStateException("Game is already over");
        }
        if (!playersTurn.isEmpty() && playersTurn.peek().getPiece().getType().equals(player.getPiece().getType())) {
            throw new IllegalStateException("It's not " + player.getName() + "'s turn");
        }
        board.addPiece(row, col, player.getPiece());
        playersTurn.push(player);
        System.out.println(player.getName() + " played at (" + row + ", " + col + ")");
        int winner = checkWinner();
        if (winner == 1) {
            System.out.println("Game Over! " + player.getName() + " wins!");
        } else if (winner == 0) {
            System.out.println("Game Over! It's a draw!");
        }
    }

    public void printBoard() {
        board.printBoard();
    }

    private int checkWinner(){
        // Check rows 
        for(int i=0; i<Board.SIZE; i++) {
            if(board.grid[i][0] != null && board.grid[i][1] != null && board.grid[i][2] != null && board.grid[i][0].getType() == board.grid[i][1].getType() && board.grid[i][0].getType() == board.grid[i][2].getType()) {
                gameOver = true;
                return 1;
            }
        }

        // Check columns
        for(int i=0; i<Board.SIZE; i++) {
            if(board.grid[0][i] != null && board.grid[1][i] != null && board.grid[2][i] != null && board.grid[0][i].getType() == board.grid[1][i].getType() && board.grid[0][i].getType() == board.grid[2][i].getType()) {
                gameOver = true;
                return 1;
            }
        }

        // Check left diagonal
        if(board.grid[0][0] != null && board.grid[1][1] != null && board.grid[2][2] != null && board.grid[0][0].getType() == board.grid[1][1].getType() && board.grid[0][0].getType() == board.grid[2][2].getType()) {
            gameOver = true;
            return 1;
        }

        // Check right diagonal
        if(board.grid[0][2] != null && board.grid[1][1] != null && board.grid[2][0] != null && board.grid[0][2].getType() == board.grid[1][1].getType() && board.grid[0][2].getType() == board.grid[2][0].getType()) {
            gameOver = true;
            return 1;
        }

        // Check for draw
        if (playersTurn.size() == Board.SIZE * Board.SIZE) {
            gameOver = true;
            return 0; // Draw
        }

        return -1; // No winner yet
    }
}
