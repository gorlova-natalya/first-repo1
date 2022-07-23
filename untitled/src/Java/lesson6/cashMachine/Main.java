package Java.lesson6.cashMachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(10, 20, 25);
        cashMachine.addMoney(10, 15, 20);
        System.out.println(cashMachine);

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму для получения: ");
        int sum = in.nextInt();
        boolean result = cashMachine.takeAwayMoney(sum);
        if (result) {
            System.out.println("Операция успешна");
        } else {
            System.out.println("Операция не успешна");
        }
    }
}
