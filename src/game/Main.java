package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello player, this is a Tic-Tac-Toe made by Kornél Dubai. Hope you enjoy!");
        char playerSymbol = 'x';
        char cpuSymbol = 'o';
        char symbol = ' ';
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };

        gameBoard(board);
        while (!gameStatus(board, symbol)){
            playerMovement(board, playerSymbol, symbol);
            gameBoard(board);
            if (gameStatus(board, symbol = playerSymbol)) {
                humanVictoryMsg();break;
            }
            cpuMovement(board, cpuSymbol, symbol);
            gameBoard(board);
            if (gameStatus(board, symbol = cpuSymbol)){
                cpuVictoryMsg();break;
            }
        }
    }

    public static void gameBoard(char[][] board) {
        for(byte i = 0; i < board.length; i++){
            for (byte j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+" ");
            }
                System.out.println();
            }
        }
    public  static void playerMovement(char[][] board, char playerSymbol, char symbol){
        symbol = playerSymbol;
        System.out.println("Please give a number between 1-9");
        Scanner scanner = new Scanner(System.in);
        while (true){
            switch (scanner.nextByte()) {
                case (1):if (board[0][0] == '-'){
                    board[0][0] = symbol;
                    return;} else {takenErr();continue;}
                case (2):if (board[0][1] == '-'){
                    board[0][1] = symbol;
                    return;} else {takenErr();continue;}
                case (3):if (board[0][2] == '-'){
                    board[0][2] = symbol;
                    return;} else {takenErr();continue;}
                case (4):if (board[1][0] == '-'){
                    board[1][0] = symbol;
                    return;} else {takenErr();continue;}
                case (5):if (board[1][1] == '-'){
                    board[1][1] = symbol;
                    return;} else {takenErr();continue;}
                case (6):if (board[1][2] == '-'){
                    board[1][2] = symbol;
                    return;} else {takenErr();continue;}
                case (7):if (board[2][0] == '-'){
                    board[2][0] = symbol;
                    return;} else {takenErr();continue;}
                case (8):if (board[2][1] == '-'){
                    board[2][1] = symbol;
                    return;} else {takenErr();continue;}
                case (9):if (board[2][2] == '-'){
                    board[2][2] = symbol;
                    return;} else {takenErr();continue;}
                default:
                    System.out.println("Incorrect number, please give a number between 1-9");
            }
        }
    }
    public  static boolean gameStatus(char[][] board, char symbol){
    boolean isItOver = false;
        if(board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) {isItOver = true;}
        else if (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) {isItOver = true;}
        else if (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) {isItOver = true;}
        else if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {isItOver = true;}
        else if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {isItOver = true;}
        else if (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) {isItOver = true;}
        else if (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) {isItOver = true;}
        else if (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) {isItOver = true;}
        return isItOver;
    }
    public static void cpuMovement(char[][] board, char cpuSymbol, char symbol){
        symbol = cpuSymbol;
        byte row, col;
        do {
            row = (byte) (Math.random()*3);
            col = (byte) (Math.random()*3);
            }
        while (board[row][col] != '-');
        board[row][col] = symbol;
        System.out.println("CPU makes a move, watch out!");
    }
    public static void takenErr() {
        System.out.println("Position is already taken, please pick another number.");
    }
    public static void humanVictoryMsg() {
        System.out.println("You win!");
    }
    public static void cpuVictoryMsg() {
        System.out.println("You lose, CPU win!");
    }
}
