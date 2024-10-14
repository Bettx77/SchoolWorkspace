import java.io.*;

public class Exceptions {
public static void readChar() {
    System.out.println("Zadejte znak: ");
        try {
            char Znak = (char) System.in.read();
            System.out.print(Znak);
        } catch (IOException e) {
            System.out.println("Chyba cteni dat");
        }
    }
}
