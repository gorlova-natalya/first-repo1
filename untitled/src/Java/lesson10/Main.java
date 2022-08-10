package Java.lesson10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str = "4444-ABC-3245-def-7j8h";
        StringService.printNumbersBlocks(str);
        StringService.replaceLettersBlocks(str);
        StringService.printLettersLower(str);
        StringService.printLettersUpper(str);
        StringService.containsAbc(str);
        StringService.startCheck(str);
        StringService.endCheck(str);

        String stringWords = "Афанасий, eggs1, численность, ананас, понедельник, Привет!";
        StringService.shortestWord(stringWords);
        StringService.longestWord(stringWords);
        StringService.wordWithLeastNumberOfChars(stringWords);

        String stringWithPalindrome = "Афанасий, шалаш, ананас, дед, комок, тренер";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер слова в строке для проверки ");
        int value = in.nextInt();
        while (!StringService.palindromeCheck(stringWithPalindrome, value)) {
            value = in.nextInt();
        }

        String stringForDouble = "Требуется задублировать каждую букву";
        StringService.stringDouble(stringForDouble);
    }
}
