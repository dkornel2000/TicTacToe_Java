package game;

//Run this
public class Logic extends Main {
    public static void main(String[] args) {

        char playerSymbol = 'x';
        char cpuSymbol = 'o';
        char symbol = ' ';
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };

        welcomeMsg();

        gameBoard(board);
        while (!gameStatus(board, symbol)) {
            playerMovement(board, playerSymbol);
            if (gameStatus(board, playerSymbol)) {
                humanVictoryMsg();
                break;
            }
            cpuMovement(board, cpuSymbol, symbol);
            if (gameStatus(board, cpuSymbol)) {
                cpuVictoryMsg();
                break;
            }
        }
    }
}
