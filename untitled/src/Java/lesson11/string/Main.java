package Java.lesson11.string;

public class Main {

    public static void main(String[] args) {

        String str = "5554-ABC-3245-def-7j8h";
        String str1 = "4444-cab-3245-def-1a2b";

        StringService.containsAbc(str);
        try {
            StringService.containsAbc(str1);
        } catch (SequenceInTheNumberException e) {
            System.out.println(e.getMessage());
        }

        StringService.startCheck555(str);
        try {
            StringService.startCheck555(str1);
        } catch (NumberBeginningFormatException e) {
            System.out.println(e.getMessage());
        }

        StringService.endCheck1a2b(str1);
        try {
            StringService.endCheck1a2b(str);
        } catch (NumberEndFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
