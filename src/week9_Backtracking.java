public class week9_Backtracking {
    /*
    Backtracking
    Backtracking is a technique used to solve problems by trying out different possibilities and undoing them if
    they don’t lead to a valid solution.
    It’s particularly useful for problems where you need to explore multiple paths to find the correct outcome.

    Backtracking example: N-Queens Problem
    In the N-Queens problem, you need to place N chess queens on an N×N chessboard in such a way
    that no two queens threaten each other.
    */

    static int N = 4; // You can change this to the desired board size

    /* A utility function to print solution */
    static void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }

    /* A utility function to check if a queen can be placed on board[row][col].
       Note that this function is called when "col" queens are already placed
       in columns from 0 to col - 1. So we need to check only left side for
       attacking queens */
    static boolean isSafe(int board[][], int row, int col) {
        int i, j;

        // Check this row on left side
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    /* A recursive utility function to solve N Queen problem */
    static boolean solveNQueen(int board[][], int col) {
        // If all queens are placed then return true
        if (col >= N) {
            return true;
        }

        // Consider this column and try placing this queen in all rows one by one
        for (int i = 0; i < N; i++) {
            // Check if the queen can be placed on board[i][col]
            if (isSafe(board, i, col)) {
                // Place this queen in board[i][col]
                board[i][col] = 1;

                // Recur to place rest of the queens
                if (solveNQueen(board, col + 1)) {
                    return true;
                }

                // If placing queen in board[i][col] doesn't lead to a solution
                // then remove queen from board[i][col] (backtrack)
                board[i][col] = 0;
            }
        }

        // If the queen cannot be placed in any row in this column, return false
        return false;
    }

    /* This function solves the N Queen problem using Backtracking. It mainly
       uses solveNQueen() to solve the problem. It returns false if queens
       cannot be placed, otherwise, it returns true and prints placement of
       queens in the form of 1s. Please note that there may be more than one
       solutions, this function prints one of the feasible solutions. */
    static boolean solveNQ() {
        int board[][] = new int[N][N];

        if (!solveNQueen(board, 0)) {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public static void main(String[] args) {
        solveNQ();
    }
}
