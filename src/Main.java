import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try  {
            FinalExam_1 exam = new FinalExam_1("C:\\Users\\betty\\Documents\\GitHub\\SchoolWorkspace\\src\\data.txt");
            double countDouble = FinalExam_1.rowInput()[0];
            int count = (int) countDouble;
            System.out.println(count);
            double[][] matrix = new double[count][count];
            for (int i = 0; i < count; i++) {
                matrix[i] = FinalExam_1.rowInput();
            }

            System.out.println(Arrays.deepToString(FinalExam_1.transpose(count, matrix)));

        } catch (IOException e) {
            System.err.println("Chyba při práci se souborem: " + e.getMessage());
        }

        /* ----- for Input -----
        // Zadejte cestu k souboru
        String filePath = "C:\\Users\\betty\\Documents\\GitHub\\SchoolWorkspace\\src\\data.txt";

        ArrayList<int[]> poles = new ArrayList<>();
        Input input = null;

        
        try  {
            input = new Input(filePath);
            int[] pole;
            while ((pole = input.rowInput()) != null) {
                poles.add(pole);
            }
        } catch (IOException e) {
            System.err.println("Chyba při práci se souborem: " + e.getMessage());
        }

        // Výstup pro kontrolu
        for (int[] pole : poles) {
            System.out.println(Arrays.toString(pole));
        }*/

        /* ----- for Triangle Object -----
        // Exceptions.readChar();
        //System.out.println(Exceptions.readInt());

        try {
            TriangleObject abc = new TriangleObject(3, 5, 4);
            System.out.println(abc.obvod());
            System.out.println(abc.obsah());
        } catch (ArithmeticException e) {
            System.out.println("Nezadali jste platne cislo");
        } finally {
            System.out.println("Konec výjimek");
        }


        /* ----- for Regular Expressions -----
        RegularExpressions.printingNumbersWithoutPrefix();
        RegularExpressions.findImgSource();


        /* ----- for Number In string -----
        String cyslo = "03746";
        char znak = '4';
        System.out.println(Pracovni.znakNaCifru(znak));

        System.out.println(Pracovni.stringNaCislo(cyslo));

        String veta = "Jelenovi pivo nelej";
        Pracovni.rozdeleniVety(veta);
        System.out.println(Pracovni.reverseString("Hokej"));
        System.out.println(Pracovni.reverseWordsPlus(veta));
        */

        /* ----- for Dynamic Array -----
        int[] mojePole = {1,2,3,4,5,6};
        mojePole[2] = 10;

        // DynamicArray.printNormalArray(mojePole);

        DynamicArray dPole = new DynamicArray();
        dPole.add(10);
        dPole.add(20);
        dPole.add(30);
        dPole.add(40);
        dPole.add(50);
        dPole.add(60);
        dPole.add(70);
        dPole.add(80);
        dPole.add(90);
        dPole.add(100);
        dPole.add(110);
        //System.out.println(dPole.pole[0]);
        dPole.printDynamicArray();
        dPole.deleteMiddleElement(4);
        */

    }
}