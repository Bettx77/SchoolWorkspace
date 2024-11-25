import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Input {
    public static void zpracuj(String zdrojovy, String cilovy) throws IOException {
        FileReader zdrojPom = new FileReader(zdrojovy);
        BufferedReader zdroj = new BufferedReader(zdrojPom);
        FileWriter cilPom = new FileWriter(cilovy);
        BufferedWriter cil = new BufferedWriter(cilPom);

        String radka;

        while ((radka = zdroj.readLine()) != null){
            System.out.println(radka);
            cil.write(radka);
            cil.newLine();
        }

        zdrojPom.close();
        cil.close();

    }

    public static double[][] NactiMatici(String filePath) throws IOException{
    FileReader zdrojPom = new FileReader(filePath)
    }
}
