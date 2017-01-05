package TicTacToe;

public class Full {

    //Sprawdzenie czy tablica jest pełna
    public static boolean full(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    return true;
                }
            }
        }
        System.out.println("Tablica pełna");
        return false;
    }
}