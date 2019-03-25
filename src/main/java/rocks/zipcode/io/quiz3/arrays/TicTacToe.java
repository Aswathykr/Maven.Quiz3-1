package rocks.zipcode.io.quiz3.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String [][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[board[0].length];
        for(int i = 0; i < column.length; i++){
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = board[rowIndex];
        return Arrays.stream(row).allMatch(value -> value.equals(row[0]));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        return Arrays.stream(column).allMatch(value -> value.equals(column[0]));
    }

    public String getWinner() {

        String winner = "";
        for (int i = 0; i < board.length; i++) {
            if(isRowHomogenous(i)){
                winner = board[i][0];
                break;
            }
            if(isColumnHomogeneous(i)){
                winner = board[0][i];
                break;
            }
        }
        if(winner.isEmpty()){
            if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
                winner = board[0][0];
            }else if( board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])){
                winner = board[0][2];
            }
        }
        return winner;
    }

    public String[][] getBoard() {
        return board;
    }
}
