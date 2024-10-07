public class NumberInString {
    static boolean jeCeleCislo(String text) {
        for (int i = 0; i < text.length(); i++) {
            char znak = text.charAt(i);
            if (!Character.isDigit(znak))
                return false;
        }
        return true;
    }

    static int znakNaCifru(char znak) {
        int cislo = Character.getNumericValue(znak);

        return cislo;
    }

    static int stringNaCislo(String cislo) {
        int cisloInt = Integer.parseInt(cislo);

        return cisloInt;
    }

    static void rozdeleniVety(String veta) {
        String[] pole = veta.split(" ");

        for (String slovo : pole)
            System.out.println(slovo);
    }
    /*static String otocSlovo(String slovo){
        String[] pole = slovo.split("");
        int delka = pole.length;
        String[] reversedPole = new String[delka];
        pole[0] = pole[0].toLowerCase();

        // for (int i = pole.length-1; i>=0; i--){
        for (int i = 0; i < delka-1; i++){
            reversedPole[i] = pole[delka-i-1];
        }


        String reversedString = String.join("", reversedPole);

        return reversedString;
    }*/


    // Metoda pro obrácení řetězce pozpátku
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
    // Metoda pro obrácení pořadí slov v řetězci
    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    // Metoda pro otočení pořadí slov a otočení každého slova
    public static String reverseWordsPlus(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            StringBuilder wordReverse = new StringBuilder();
            wordReverse.append(words[i]);
            reversed.append(wordReverse.reverse().toString());
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
