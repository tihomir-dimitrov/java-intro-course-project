package Blocks;

import javafx.beans.property.Property;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static Blocks.Dice.roll1;

public class Player {
    public static ArrayList<Player> players;
    public static ArrayList<Property> properties;
    public static Dice d6;

    public static void main(String beans[]) throws IOException, BadData {
        initializeData();

        Player player1 = new Player("Player 1", Player.dog);
        players.add(player1);
        Player player2 = new Player("Player 2", Player.cat);
        players.add(player2);
        Player player3 = new Player("Player 3", Player.car);
        players.add(player3);

        boolean gameOver = false;
        int counter = 0;

        do {
            in.nextLine();
            gameOver = takeTurn(players.get(counter), d6, properties, in);
            in.nextLine();
            counter++;
            if (counter > players.size() - 1)
                counter = 0;
        } while (!gameOver);
    }

    public static void takeTurn(Player p, Dice d6, ArrayList<Property> properties, Scanner in) {
        int roll1, roll2, rollSum;
        boolean gameOver = false;
    }

    {
        System.out.print("Ти хвърли: " + roll1);
    }

    public static void setPlayerNames(ArrayList<Player> players, Scanner in) {
        for (Player p : players) {
            System.out.print("Enter a name for " + p.getName() + ": ");
            p.setName(in.nextLine());
        }
    }
}