import java.io.*;

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

}
