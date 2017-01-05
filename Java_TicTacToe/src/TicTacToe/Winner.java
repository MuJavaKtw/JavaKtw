package TicTacToe;

public class Winner {

    //metoda wypisująca zwycięzce
    public void winner(int winner) {

        String winnerSign;

        if (winner == 1) {
            winnerSign = "Kółka";
        } else {
            winnerSign = "Krzyżyki";
        }

        System.out.println("GRATULACJE! " + winnerSign + " wygrały.");

    }

    //sprawdzanie czy mamy zwycięzce
    public boolean getWinner(int[][] board) {

        //todo: jeżeli jakiś kod się powtarza, warto wydzielić go do osobnej meody i sparametryzować
        //todo: a nie da się tego zastąpić jednym warunkiem? Tego wyżej też.

        boolean row;
        boolean col;
        boolean diagonal1, diagonal2;

        for (int i = 0; i < 3; i++) {
            row = (board[0][i] == (board[1][i]) && board[0][i] == (board[2][i])) && board[0][i] != 0;
            col = (board[i][0] == (board[i][1]) && board[i][0] == (board[i][2])) && board[i][0] != 0;
            diagonal1 = (board[0][0] == (board[1][1]) && board[0][0] == (board[2][2])) && board[1][1] != 0;
            diagonal2 = (board[0][2] == (board[1][1]) && board[0][2] == (board[2][0])) && board[1][1] != 0;
            //   (board[0][2] == (board[1][1]) && board[1][1] == (board[2][0]));
            if (col) {
                winner(board[i][0]);
                return false;
            } else if (row) {
                winner(board[0][i]);
                return false;
            } else if (diagonal1 || diagonal2) {
                winner(board[1][1]);
                return false;
            }
        }
        return true;
    }

}