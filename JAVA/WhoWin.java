import java.util.Scanner;

public class WhoWin {
    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            String row = scanner.nextLine();
            row = row.replaceAll("\\s+","");
            board[i] = row.toCharArray();
        }
        scanner.close();

        // Check for a winner
        String winner = findWinner(board);

        // Print the result
        System.out.println(winner);
    }

    // Find the winner of the tic-tac-toe game
    private static String findWinner(char[][] board) {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][0] == board[row][2]) {
                if (board[row][0] == 'X') {
                    return "Johan har vunnit";
                } else if (board[row][0] == 'O') {
                    return "Abdullah har vunnit";
                }
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == board[1][col] && board[0][col] == board[2][col]) {
                if (board[0][col] == 'X') {
                    return "Johan har vunnit";
                } else if (board[0][col] == 'O') {
                    return "Abdullah har vunnit";
                }
            }
        }

        // Check diagonals
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            if (board[0][0] == 'X') {
                return "Johan har vunnit";
            } else if (board[0][0] == 'O') {
                return "Abdullah har vunnit";
            }
        }

        if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            if (board[0][2] == 'X') {
                return "Johan har vunnit";
            } else if (board[0][2] == 'O') {
                return "Abdullah har vunnit";
            }
        }

        // No winner
        return "ingen har vunnit";
    }
}
