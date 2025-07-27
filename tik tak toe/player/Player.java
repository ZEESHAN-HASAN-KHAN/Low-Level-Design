package player;

import piece.Piece;
import piece.PieceType;

public class Player {
    private String name;
    private Piece piece;

    public Player(String name, PieceType pieceType) {
        this.name = name;
        this.piece = new Piece(pieceType);
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }
}
