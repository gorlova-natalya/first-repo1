package Java.lesson6.creditCard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CreditCard creditCard1 = new CreditCard("BY36_ALFA_8096_7654_7600_4321_0000", 708.90);
        CreditCard creditCard2 = new CreditCard("BY42_ALFA_8095_7690_8000_9876_0000", 80.50);
        CreditCard creditCard3 = new CreditCard("BY56_ALFA_3014_5490_8000_9907_0000", 7.50);

        System.out.println("Введите сумму для пополнения счета 1: ");
        double value = in.nextDouble();
        creditCard1.refill(value);

        System.out.println("Введите сумму для пополнения счета 2: ");
        value = in.nextDouble();
        creditCard2.refill(value);

        System.out.println("Введите сумму для списания со счета 3: ");
        value = in.nextDouble();
        creditCard3.debiting(value);

        creditCard1.printBalance();
        creditCard2.printBalance();
        creditCard3.printBalance();
    }
}
