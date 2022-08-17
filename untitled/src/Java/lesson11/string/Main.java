package Java.lesson11.string;

public class Main {

    public static void main(String[] args) {

        String str = "5554-ABC-3245-def-7j8h";
        String str1 = "4444-cab-3245-def-1a2b";

        StringService.containsSymbols(str);
        try {
            StringService.containsSymbols(str1);
        } catch (SequenceInTheNumberException e) {
            System.out.println(e.getMessage());
        }

        StringService.startCheck(str);
        try {
            StringService.startCheck(str1);
        } catch (NumberBeginningFormatException e) {
            System.out.println(e.getMessage());
        }

        StringService.endCheck(str1);
        try {
            StringService.endCheck(str);
        } catch (NumberEndFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
