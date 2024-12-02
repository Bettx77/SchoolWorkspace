import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

class Input {

    private BufferedReader reader;

    public Input(String filePath) throws IOException {
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

//    public static void zpracuj(String zdrojovy, String cilovy) throws IOException {
//        FileReader zdrojPom = new FileReader(zdrojovy);
//        BufferedReader zdroj = new BufferedReader(zdrojPom);
//        FileWriter cilPom = new FileWriter(cilovy);
//        BufferedWriter cil = new BufferedWriter(cilPom);
//
//        String radka;
//
//        while ((radka = zdroj.readLine()) != null){
//            System.out.println(radka);
//            cil.write(radka);
//            cil.newLine();
//        }
//
//        zdrojPom.close();
//        cil.close();
//
//
//    }
}
