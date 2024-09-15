import java.util.Scanner;

public class sudokusolver {

    // Function to print the Sudoku board
    public static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            if (r % 3 == 0 && r != 0) {
                System.out.println("-----------");
            }
            for (int d = 0; d < 9; d++) {
                if (d % 3 == 0 && d != 0) {
                    System.out.print("|");
                }
                System.out.print(board[r][d]);
            }
            System.out.println();
        }
    }

    // Function to check if it's safe to place a number at board[row][col]
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check the row
        for (int d = 0; d < 9; d++) {
            if (board[row][d] == num) {
                return false;
            }
        }

        // Check the column
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == num) {
                return false;
            }
        }

        // Check the 3x3 sub-grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int r = startRow; r < startRow + 3; r++) {
            for (int d = startCol; d < startCol + 3; d++) {
                if (board[r][d] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Function to solve Sudoku using backtracking
    public static boolean solveSudoku(int[][] board) {
        int row = -1, col = -1;
        boolean isEmpty = true;

        // Find an empty cell
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        // No empty space means the puzzle is solved
        if (isEmpty) {
            return true;
        }

        // Try placing digits 1 to 9 in the empty cell
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;

                // Recur to solve the rest of the board
                if (solveSudoku(board)) {
                    return true;
              }

                // If placing num doesn't lead to a solution, backtrack
                board[row][col] = 0;
            }
        }

        return false; // Trigger backtracking
    }

    // Interactive function to take user input for the Sudoku puzzle
    public static void inputBoard(int[][] board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sudoku puzzle (0 for empty cells):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[9][9];

        inputBoard(board);
        System.out.println("Initial Sudoku Board:");
        printBoard(board);

        if (solveSudoku(board)) {
            System.out.println("Solved Sudoku Board:");
            printBoard(board);
        } else {
            System.out.println("No solution exists for the given Sudoku puzzle.");
        }
    }
}
