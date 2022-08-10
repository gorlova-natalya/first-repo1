package Java.lesson10;

public class StringService {

    public static void printNumbersBlocks(String str) {
        System.out.println(str.substring(0, 4) + str.substring(9, 13));
    }

    public static void replaceLettersBlocks(String str) {
        System.out.println(str.replaceAll("\\b[a-zA-Z]{3}\\b", "***"));
    }

    private static StringBuilder chooseLetters(String str) {
        String[] splitString = str.replaceAll("\\d", "-").split("-");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : splitString) {
            if (!string.isBlank()) {
                if (!stringBuilder.isEmpty()) {
                    stringBuilder.append("/");
                }
                stringBuilder.append(string);
            }
        }
        return stringBuilder;
    }

    public static void printLettersLower(String str) {
        System.out.println(chooseLetters(str).toString().toLowerCase());
    }

    public static void printLettersUpper(String str) {
        System.out.println(chooseLetters(str).toString().toUpperCase());
    }

    public static void containsAbc(String str) {
        if (str.toLowerCase().contains("Abc".toLowerCase())) {
            System.out.println("Строка содержит символы abc");
        } else {
            System.out.println("Строка не содержит символы abc");
        }
    }

    public static void startCheck(String str) {
        if (str.startsWith("555")) {
            System.out.println("Строка начинается с 555");
        } else {
            System.out.println("Строка не начинается с 555");
        }
    }

    public static void endCheck(String str) {
        String str2 = "1a2b";
        if (str.endsWith(str2)) {
            System.out.println("Строка заканчивается на " + str2);
        } else {
            System.out.println("Строка не заканчивается на " + str2);
        }
    }

    public static void shortestWord(String stringWords) {
        String[] splitString = stringWords.replaceAll(" ", "").split(",");
        String shortest = null;
        for (String strings : splitString) {
            if (shortest == null || (shortest.length() >= strings.length())) {
                shortest = strings;
            }
        }
        System.out.println("Самое короткое слово " + shortest);
    }

    public static void longestWord(String stringWords) {
        String[] splitString = stringWords.replaceAll(" ", "").split(",");
        String longest = null;
        for (String strings : splitString) {
            if (longest == null || (longest.length() <= strings.length())) {
                longest = strings;
            }
        }
        System.out.println("Самое длинное слово " + longest);
    }


    private static int differentChars(String stringWords) {
        StringBuilder stringBuilder = new StringBuilder();
        String symbol;
        for (int i = 0; i < stringWords.length(); i++) {
            symbol = String.valueOf(stringWords.charAt(i));
            if (stringBuilder.indexOf(symbol) == -1)
                stringBuilder.append(symbol);
        }
        return (stringBuilder.length() - 1);
    }

    public static void wordWithLeastNumberOfChars(String stringWords) {
        String[] splitString = stringWords.split(",");
        String result = splitString[0];
        for (int i = 1; i < splitString.length; i++) {
            if (differentChars(splitString[i]) < differentChars(result))
                result = splitString[i];
        }
        System.out.println("Слово: " + result + ", количество разных символов: " + differentChars(result));
    }

    public static boolean palindromeCheck(String stringWithPalindrome, int value) {
        String[] splitString = stringWithPalindrome.replaceAll(" ", "").split(",");
        if (value > splitString.length || value < 1) {
            System.out.println("В строке нет столько слов, введите цифру от 1 до " + splitString.length);
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder(splitString[value - 1]);
            if (splitString[value - 1].equals(stringBuilder.reverse().toString())) {
                System.out.println("Слово является палиндромом");
            } else {
                System.out.println("Слово не является палиндромом");
            }
            return true;
        }
    }

    public static void stringDouble(String stringForDouble) {
        char[] charString = stringForDouble.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char chars : charString) {
            stringBuilder.append(chars).append(chars);
        }
        System.out.println(stringBuilder);
    }
}
