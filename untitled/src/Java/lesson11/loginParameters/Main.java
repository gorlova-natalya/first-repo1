package Java.lesson11.loginParameters;

public class Main {

    public static void main(String[] args) throws Exception {

        if (LogInToTheSystem.enterTheSystem("76543fciytd", "123пр455", "123пр 455")) {
            System.out.println("Вход выполнен успешно");
        } else {
            System.out.println("Вход не выполнен");
        }
    }
}
