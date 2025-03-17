import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.IOException;
import java.util.Arrays;

public class MaturitkaMatice {

    private static BufferedReader reader;

    public static void main(String args[]) {
        reader = new BufferedReader(new FileReader(filePath));

    }

    public int[] rowInput() {
        try {
            String row = reader.readLine();
            if (row == null || row.isEmpty()) {
                return null;
            }

            // Rozdělení řádku na čísla
            String[] cislaJakoStringy = row.trim().split("\\s+");
            return Arrays.stream(cislaJakoStringy)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (IOException | NumberFormatException e) {
            System.err.println("Chyba při čtení řádku: " + e.getMessage());
        }
        return null;
    }

}
