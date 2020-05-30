package Blocks;

public class GameBoard {
    public static void main(String[] args) {
        char[][] gameBoard = {
                {'|','X','|', 'X','|', 'X','|', 'X','|', 'X','|', 'X','|', 'X', '|'},
                {'|','X','|', ' ', ' ', ' ', ' ', ' ',' ',' ',' ',' ','|', 'X','|'},
                {'|','X','|', ' ', ' ', ' ', ' ', ' ',' ',' ',' ',' ','|', 'X','|'},
                {'|','X','|', 'X','|', 'X','|', 'X','|', 'X','|', 'X','|', 'S','|'}
        };

        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
