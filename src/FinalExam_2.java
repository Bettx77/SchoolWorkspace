import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class FinalExam_2 {
    private static BufferedReader reader;

    public FinalExam_2(String filePath) throws IOException {
        reader = new BufferedReader(new FileReader(filePath));
    }

    public static ArrayList<Double> rowInput() {
        ArrayList<Double> return_values = new ArrayList<>();
        try {
            String row = reader.readLine();
            if (row == null || row.isEmpty()) {
                return return_values;
            }

            // Rozdělení řádku na čísla
            String[] cislaJakoStringy = row.trim().split("\\s+");
            for (String string:cislaJakoStringy){
                try{
                    double cislo = Double.parseDouble(string);
                    return_values.add(cislo);
//                    System.out.println(cislo);
                } catch (NumberFormatException a) {

                }
            }

            return return_values;
        } catch (IOException | NumberFormatException e) {
            System.err.println("Chyba při čtení řádku: " + e.getMessage());
        }
        return null;
    }
}
