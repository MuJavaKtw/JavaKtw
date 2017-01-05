package TicTacToe;

public class Player {

    //Zamiana gracza
    public int changePlayer(int choice) {

        if (choice == 1) {
            choice = 2;
        } else {
            choice = 1;
        }
        return choice;
    }
}

