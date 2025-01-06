import java.util.Arrays;

public class MatrixMultiplication {

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsFirstMatrix = firstMatrix.length;
        int columnsFirstMatrix = firstMatrix[0].length;
        int columnsSecondMatrix = secondMatrix[0].length;

        int[][] resultMatrix = new int[rowsFirstMatrix][columnsSecondMatrix];

        for (int i = 0; i < rowsFirstMatrix; i++) {
            for (int j = 0; j < columnsSecondMatrix; j++) {
                for (int k = 0; k < columnsFirstMatrix; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        int[][] matice1 = {
                {1, 2},
                {4, 5},
                {7, 8}
        };

        int[][] matice2 = {
                {9, 8, 7},
                {6, 5, 4}
        };

        int[][] result = multiplyMatrices(matice1, matice2);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
