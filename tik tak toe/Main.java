import piece.PieceType;
import player.Player;
import tictactoe.TicTacToeGame;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = TicTacToeGame.getInstance();
        Player playerA = new Player("Alice", PieceType.X);
        Player playerB = new Player("Bob", PieceType.O);
        // Initialize players and start the game
        try {
            game.registerPlayer(playerA);
            game.registerPlayer(playerB);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        // Example moves
        try {
            game.playMove(playerA, 0, 0);
            game.playMove(playerB, 1, 1);
            game.playMove(playerA, 0, 1);
            game.playMove(playerB, 2, 2);
            game.playMove(playerA, 0, 2); // Alice wins
            game.printBoard();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
