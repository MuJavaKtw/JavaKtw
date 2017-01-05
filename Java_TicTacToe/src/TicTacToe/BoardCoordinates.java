package TicTacToe;

public class BoardCoordinates {
    public void board() {

        System.out.println("Współrzędne pól");

        for (int y = 0; y <= 2; y++) {
            for (int x = 0; x <= 2; x++) {
                System.out.print((x + 1) + " " + (y + 1));
                if (x != 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (y != 2) {
                System.out.print("----------------");
                System.out.println();
            }
        }
    }
}
