import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FinalExam_1 {
    private static BufferedReader reader;

    public FinalExam_1(String filePath) throws IOException {
        reader = new BufferedReader(new FileReader(filePath));
    }

    public static double[] rowInput() {
        try {
            String row = reader.readLine();
            if (row == null || row.isEmpty()) {
                return null;
            }

            // Rozdělení řádku na čísla
            String[] cislaJakoStringy = row.trim().split("\\s+");
            return Arrays.stream(cislaJakoStringy)
                    .mapToDouble(Double::parseDouble)
                    .toArray();
        } catch (IOException | NumberFormatException e) {
            System.err.println("Chyba při čtení řádku: " + e.getMessage());
        }
        return null;
    }

    public static double[][] transpose(int size, double[][] matrix){
        double[][] finalMatrix = new double[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                finalMatrix[j][i] = matrix [i][j];
            }
        }
        return finalMatrix;
    }

    public static void sum(int size, double[][] matrix){
        for(int i = 0; i < size; i++) {
            double sum = 0;
            for (int j = 0; j < size; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + " is " + sum);
        }
    }
}
