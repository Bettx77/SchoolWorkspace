class Chess {
    static final int N = 8;
    static int solutionsCount = 1;

    // punkce pro kontrolu bezpečnosti umístění dámy
    static boolean isSafe(int board[][], int row, int col) {
        // kontrola sloupce
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // kontrola levé diagonály
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // kontrola pravé diagonály
        for (int i = row, j = col; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // funkce pro umístění dam
    static boolean solveNQueens(int board[][], int row) {
        if (row >= N) {
            printSolution(board);
            solutionsCount++;
            return true;
        }

        boolean foundSolution = false; // kontrola najití

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;

                // umístění další dámy do dalšího řádku
                foundSolution = solveNQueens(board, row + 1) || foundSolution;

                //  odstranění dámy
                board[row][col] = 0;
            }
        }

        return foundSolution;
    }

    // print
    static void printSolution(int board[][]) {
        System.out.println("=====  " + solutionsCount + "  =====");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 0)
                    System.out.print(". ");
                if (board[i][j] == 1)
                    System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int board[][] = new int[N][N];

        if (!solveNQueens(board, 0)) {
            System.out.println("Řešení neexistuje.");
        }
    }
}
