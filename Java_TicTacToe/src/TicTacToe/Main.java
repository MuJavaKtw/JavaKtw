package TicTacToe;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        boolean noWinner = true;
        int[][] board = new int[3][3];
        boolean validation = true;

        //Rysujemy tablicę współrzędnych
        BoardCoordinates boardCoordinates = new BoardCoordinates();
        boardCoordinates.board();

        //Startujemy z wyborem kółko lub krzyżyk
        Start start = new Start();
        int choice = start.getChoice();

        // Główna pętla - jeśli nie wyłoni zwycięzcy to będzie działać
        while (noWinner) {
            //todo: staraj się nie nazywać zmiennych w ten sposób. Niżej nie wiadomo co znaczy
            //todo: staraj się nie nazywać tak zmiennych
            //todo: pobierasz input

            Hit hit = new Hit();

            String hitInput = hit.getInput();

            while (validation) {
                if (hitInput == null || !hitInput.matches("[1-3][1-3]")) {
                    System.out.println("Podałeś złe współrzędne");
                    hitInput = hit.getInput();
                    validation = true;
                } else {
                    validation = false;
                }
            }

            // wydzielenie ze strzału współrzędnych x oraz y
            String[] coordinates = hitInput.split("(?<=.)");
            int x = Integer.parseInt(coordinates[0]);
            int y = Integer.parseInt(coordinates[1]);

            // wpisanie strzału do tablicy [3] na [3]
            if (board[x - 1][y - 1] == 0) {
                board[x - 1][y - 1] = choice;
                //Zamiana gracza jeśli strzał został umieszczony w tablicy po walidacjach
                Player player = new Player();
                choice = player.changePlayer(choice);
            }

            // posłanie strzałów do wyświetlenia + sprawdzenie wygranej/ pełnej tablicy
            Board boardObj = new Board();
            noWinner = boardObj.setInput(board);

            validation = true;
        }
    }
}



