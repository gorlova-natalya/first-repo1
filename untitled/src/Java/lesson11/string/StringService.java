package Java.lesson11.string;

public class StringService {

    public static void containsSymbols(String str) {
        String str2 = "Abc";
        if (str.toLowerCase().contains(str2.toLowerCase())) {
            System.out.println("Строка содержит символы abc");
        } else {
            throw new SequenceInTheNumberException("Строка не содержит символы abc");
        }
    }

    public static void startCheck(String str) {
        String str2 = "555";
        if (str.startsWith(str2)) {
            System.out.println("Строка начинается с 555");
        } else {
            throw new NumberBeginningFormatException("Строка не начинается с 555");
        }
    }

    public static void endCheck(String str) {
        String str2 = "1a2b";
        if (str.endsWith(str2)) {
            System.out.println("Строка заканчивается на " + str2);
        } else {
            throw new NumberEndFormatException("Строка не заканчивается на указанные символы");
        }
    }
}
