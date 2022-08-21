package Java.lesson14.functional;

import java.util.Scanner;

public class MainFunctionalInterface {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "Реверс строки";
        int factorial = 5;

        int symbol = in.nextInt();
        if (symbol == 1) {
            FunctionalInterface<String> stringExecute = ((value) -> new StringBuilder(value).reverse().toString());
            System.out.println(stringExecute.executeFunctionalMethod(str));
        }
        if (symbol == 2) {
            FunctionalInterface<Integer> integerExecute = ((value) -> {
                int result = 1;
                for (int i = 1; i <= factorial; i++) {
                    result = result * i;
                }
                return result;
            });
            System.out.println(integerExecute.executeFunctionalMethod(factorial));
        }
    }
}
