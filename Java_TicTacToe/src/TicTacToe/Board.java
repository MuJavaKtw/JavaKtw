package TicTacToe;

import java.io.IOException;

public class Board {

    /**
     * todo: skoro podajesz w parametrze Listę, to czemu nie możesz przekazać dwuwymiarowej tablicy, gdzie już znasz położenie kółka i krzyżyka?
     *
     * @param hitGraph
     * @param choice
     * @return
     * @throws IOException
     */

    public boolean setInput(int[][] board) throws IOException {
        //todo: bardzo pokrętna logika. Nie mówię, że to źle, ale zajęło mi chwilę zanim się połapałem.
        //todo: postaraj się przepisać logikę tak by operować tylko na jednej tablicy dwuwymiarowej pomijając Listę.


        // Wpisanie na ekranie aktualnego stanu tablicy ze strzałami
        for (int y = 0; y <= 2; y++) {
            for (int x = 0; x <= 2; x++) {
                if (board[x][y] == 0) {
                    System.out.print(" ");
                } else if (board[x][y] == 1) {
                    System.out.print("O");
                } else if (board[x][y] == 2) {
                    System.out.print("X");
                }
                if (x == 2) {
                    continue;
                }
                System.out.print("|");
            }
            System.out.println();
            if (y != 2) {
                System.out.print("-----");
                System.out.println();
            }
        }

        // Sprawdzanie czy mamy zwycięzce z X lub O
        Winner win = new Winner();
        boolean winnerFromXO = win.getWinner(board);

        // Sprawdzenie czy tablica jest pełna
        Full full = new Full();
        boolean fullBoard = full.full(board);

        // Sprawdzanie czy mamy zwycięzce
        boolean winner = true;
        if (!winnerFromXO || !fullBoard) {
            winner = false;
        }

        return winner;
    }
}
