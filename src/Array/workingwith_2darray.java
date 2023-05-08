package Array;

import java.util.Arrays;

public class workingwith_2darray {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0 ; i< board.length; i++) { for (int j = 0 ; j < board[i].length; j++) {board[i][j] = '-';}}
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board));
    }
}
