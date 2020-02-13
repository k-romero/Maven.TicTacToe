package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private static Character[][] = board;
    public Board(Character[][] inputBoard) {
        this.board = inputBoard;
    }

    public boolean rowsCheck(Character playerPiece){
        boolean outcome = false;
        int boardSize = 3;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                //innerLoop checks all positions
                if(board[i][j] != playerPiece){
                    outcome = false;
                    break;
                } else { outcome = true;
                    break;
                }
            }
            if (outcome){
                break;
            }
        }
        return outcome;
    }

    public boolean colsCheck(Character playerPiece){
        boolean outcome = false;
        int boardSize = 3;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                //innerLoop checks all positions
                if(board[j][i] != playerPiece){
                    outcome = false;
                    break;
                } else { outcome = true;
                    break;
                }
            }
            if (outcome){
                break;
            }
        }
        return outcome;
    }

    public boolean topLeftBotRightCheck(Character playerPiece){
        boolean outcome = false;
        int boardSize = 3;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                //innerLoop checks all positions
                if(board[i][i] != playerPiece){
                    outcome = false;
                    break;
                } else { outcome = true;
                    break;
                }
            }
            if (outcome){
                break;
            }
        }
        return outcome;
    }

    public boolean topRightBotLeftCheck(Character playerPiece){
        boolean outcome = false;
        int boardSize = 3;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                //innerLoop checks all positions
                if(board[i][i] != playerPiece){
                    outcome = false;
                    break;
                } else { outcome = true;
                    break;
                }
            }
            if (outcome){
                break;
            }
        }
        return outcome;
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
