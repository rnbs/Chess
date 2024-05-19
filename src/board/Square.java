package board;

import piece.Piece;
import utils.Colour;

public class Square {
    // Each square in a chess will have its own row number and column name along with the colour and can hold a piece
    private final Colour colour;
    private final int rowNumber;
    private final char columnName;
    private Piece piece;

    public Square(Colour colour, int rowNumber, char columnName, Piece piece) {
        this.colour = colour;
        this.rowNumber = rowNumber;
        this.columnName = columnName;
        this.piece = piece;
    }

    public Square(Colour colour, int rowNumber, char columnName) {
        this.colour = colour;
        this.rowNumber = rowNumber;
        this.columnName = columnName;
        this.piece = null;
    }

    public boolean isOccupied() {
        return this.piece == null;
    }

    public Colour getColour() {
        return colour;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public char getColumnName() {
        return columnName;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

}
