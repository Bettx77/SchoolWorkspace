import java.util.ArrayList;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressions {

    public static void printingNumbersWithoutPrefix(){
        String text = "Telefonní čísla: +420 123 456 789, +1 987 654 321, 567 890 123, +420 208 946 958.";

        String regex = "(\\+420)\\s?(\\d{3})\\s?(\\d{3})\\s?(\\d{3})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        ArrayList<String> numbersWithoutPrefix = new ArrayList<>();

            while (matcher.find()) {
            // matcher.group(2), matcher.group(3), matcher.group(4) obsahují hlavní části čísla
            String mainNumber = matcher.group(2) + matcher.group(3) + matcher.group(4);

            numbersWithoutPrefix.add(mainNumber);
            }

            System.out.println("Čísla bez předvolby:");
            for (String number : numbersWithoutPrefix) {
                System.out.println(number);
            }
    }

    public static void findImgSource(){
        String text = "<img src = \"neco.jpg\" alt = \"neco\"/>";
        String regex = "(\\<img src = \"(\\w*.\\w*)\" alt = \"(\\w*)\"\\/\\>)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }
    }
}
