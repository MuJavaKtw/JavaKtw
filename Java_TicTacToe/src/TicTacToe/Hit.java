package TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Hit {

    /**
     * todo: komentarz
     * @return
     * @throws IOException
     */

    public String getInput() throws IOException {

        //todo: staraj się nie walidować w dwóch miejscach. W Mainie, gdzie jest wołana ta funkcja, też walidujesz. Tutaj lepiej rzucić wyjątek.

        //Odczytanie współrzędnych z konsoli
        String hit = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj pole");
        try {
            hit = br.readLine();
        } catch (IOException e) {
            System.out.println("Błąd");
        }

        return hit;
    }
}

