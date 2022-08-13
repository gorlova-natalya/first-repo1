package Java.lesson11.string;

public class StringService {

    public static void containsAbc(String str) {
        if (str.toLowerCase().contains("Abc".toLowerCase())) {
            System.out.println("Строка содержит символы abc");
        } else {
            throw new SequenceInTheNumberException("Строка не содержит символы abc");
        }
    }

    public static void startCheck555(String str) {
        if (str.startsWith("555")) {
            System.out.println("Строка начинается с 555");
        } else {
            throw new NumberBeginningFormatException("Строка не начинается с 555");
        }
    }

    public static void endCheck1a2b(String str) {
        String str2 = "1a2b";
        if (str.endsWith(str2)) {
            System.out.println("Строка заканчивается на " + str2);
        } else {
            throw new NumberEndFormatException("Строка не заканчивается на указанные символы");
        }
    }
}
