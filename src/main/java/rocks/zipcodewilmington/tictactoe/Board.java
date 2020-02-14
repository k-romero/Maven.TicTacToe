package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private static Character[][] board;
    public Board(Character[][] inputBoard) {
        this.board = inputBoard;
    }

//    0|0 0|1 0|2
//    1|0 1|1 1|2
//    2|0 2|1 2|2

//Rows (--)
    public boolean rowsCheck(Character playerPiece){
        boolean outcome = false;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if(board[j][i] != playerPiece){
                    outcome = false;
                    break;
                } else { outcome = true;}
            }
            if(outcome == true) {break;}
        }
        return outcome;
    }

//Columns (|)
    public boolean colsCheck(Character playerPiece){
        boolean outcome = false;
        for (int i = 0; i <= 2 ; i++) {
            for (int j = 0; j <= 2; j++) {
                if (board[i][j] != playerPiece){
                    outcome = false;
                    break;
                } else { outcome = true;}
            }
            if(outcome == true){break;}
        }
        return outcome;
    }

//    0|0 0|1 0|2
//    1|0 1|1 1|2
//    2|0 2|1 2|2

//Diagonal (\)
    public boolean topLeftBotRightCheck(Character playerPiece){
        boolean outcome = false;
        for (int i = 0; i <= 2; i++) {
            if(board[i][i] != playerPiece){
                outcome = false;
                break;
            } else { outcome = true;}
        }
        return outcome;
    }

    public boolean topRightBotLeftCheck(Character playerPiece){
        boolean outcome = false;
        int count = 0;
        for (int i = 2; i >= 0; i--) {
            if(board[count][i] != playerPiece){
                outcome = false;
                break;
            } else { outcome = true;
              count++;
            }
        }
        return outcome;
    }

    public Boolean isInFavorOfX() {
        boolean outcome = false;
        if (colsCheck('X') || rowsCheck('X') || topLeftBotRightCheck('X') ||topRightBotLeftCheck('X')) {
            outcome = true;
        }
        return outcome;
    }

    public Boolean isInFavorOfO() {
        boolean outcome = false;
        if (colsCheck('O') || rowsCheck('O') || topLeftBotRightCheck('O') ||topRightBotLeftCheck('O')) {
            outcome = true;
        }
        return outcome;

    }

    public Boolean isTie() {
        boolean outcome = false;
        if (isInFavorOfO() == isInFavorOfX()){
            outcome = true;
        }
        return outcome;
    }

    public String getWinner() {
        String daWinner = "";

        return daWinner;
    }

}
