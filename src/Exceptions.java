import java.io.*;

public class Exceptions {
    public static void readChar() {
        System.out.print("Zadejte znak: ");
        try {
            char Znak = (char) System.in.read();
            System.out.print(Znak);
        } catch (IOException e) {
            System.out.println("Chyba cteni dat");
        }
    }

    static int readInt(){
        byte [] pole = new byte[30];
        int nacteneCislo=0;
        String nactenyText;
        System.out.print("Kolik piv mate? ");
        try {
            System.in.read(pole);
            nactenyText = new String(pole).trim();
            nacteneCislo = Integer.valueOf(nactenyText).intValue();
        }
        catch (IOException e) {
            System.out.println("Chyba pri cteni dat");
        }
        catch (NumberFormatException e){
            System.out.println("Nezadali jste cislo");
        }
        return nacteneCislo;
    }
}
