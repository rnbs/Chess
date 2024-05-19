package board;

import utils.Colour;
import utils.constants;

import java.util.Optional;
import java.util.Map;
import java.util.HashMap;


/**
 * @author: Santosh RNB
 * @created: 5/19/24
 */
public class Board {
    private Map<String, Square> chessBoard;

    public Board() {
        chessBoard = new HashMap<>();

        for(int row : constants.ROWS) {
            Colour colour;
            if(row%2 == 1) {
                colour = Colour.Black; //A1 is Black
            }
            else {
                colour = Colour.White;
            }

            for(char col : constants.COLS) {
                Square square = new Square(colour, row, col);
                colour = colour.toggle();
            }

        }
    }

    public Optional<Square> getSquare(String squareIdentifier) {
        return validSquareIdentifier(squareIdentifier) ?
             Optional.ofNullable(chessBoard.get(squareIdentifier)) : Optional.empty();
    }

    private boolean validSquareIdentifier(String squareIdentifier) {
        if (squareIdentifier == null
                || squareIdentifier.length() != 2
                || (!constants.COLS.contains(squareIdentifier.charAt(0)))
                || (!constants.ROWS.contains(squareIdentifier.charAt(1)))) {
            throw new IllegalArgumentException("Invalid square identifier");
        }

        return true;
    }




}
