package lesson3;

import java.util.Scanner;

public class Lesson3 {

    public String winter = "Зима";
    public String spring = "Весна";
    public String summer = "Лето";
    public String autumn = "Осень";
    Scanner in = new Scanner(System.in);

    public void printTimeOfTheYearSwitch(int number) {
        switch (number) {
            case (12):
            case (1):
            case (2): {
                System.out.println(winter);
                break;
            }
            case (3):
            case (4):
            case (5): {
                System.out.println(spring);
                break;
            }
            case (6):
            case (7):
            case (8): {
                System.out.println(summer);
                break;
            }
            case (9):
            case (10):
            case (11): {
                System.out.println(autumn);
                break;
            }
        }
    }

    public void printTimeOfTheYearIf(int number) {
        if (number == 12 || (1 <= number && number <= 2)) {
            System.out.println(winter);
        } else if (3 <= number && number <= 5) {
            System.out.println(spring);
        } else if (6 <= number && number <= 8) {
            System.out.println(summer);
        } else if (9 <= number && number <= 11) {
            System.out.println(autumn);
        } else System.out.println("неподходящее для программы значение");

    }

    public void evenOrOdd() {
        System.out.println("Введите число:");
        int value = in.nextInt();
        if (value % 2 == 0) {
            System.out.println("Четное");
        } else System.out.println("Нечетное");
    }

    public void weather() {
        System.out.println("Введите значение температуры воздуха:");
        double t = in.nextDouble();
        if (-5 < t) {
            System.out.println("Тепло");
        } else if (-5 > t && t > -20) {
            System.out.println("Нормально");
        } else if (t < -20)
            System.out.println("Холодно");
    }

    public void rainbowColor() {
        System.out.println("Введите число от 1 до 7:");
        int color = in.nextInt();
        switch (color) {

            case (1): {
                System.out.println("Красный");
                break;
            }
            case (2): {
                System.out.println("Оранжевый");
                break;
            }
            case (3): {
                System.out.println("Желтый");
                break;
            }
            case (4): {
                System.out.println("Зеленый");
                break;
            }
            case (5): {
                System.out.println("Голубой");
                break;
            }
            case (6): {
                System.out.println("Синий");
                break;
            }
            case (7): {
                System.out.println("Фиолетовый");
                break;
            }
        }
    }

    public void printOdd() {
        System.out.println("Нечетные числа:");
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public void printNumbers() {
        System.out.println();
        for (int z = 5; z > 0; z--) {
            System.out.print(z + " ");
        }
    }

    public void sumAll() {
        System.out.println();
        System.out.println("Введите число для суммирования:");

        int sumY = 0;
        int valueForSum = in.nextInt();
        for (int y = 1; y <= valueForSum; y++) {
            sumY = sumY + y;
        }
        System.out.println(sumY);
    }
    public void sequenceSevens () {
        int sumS=7;
        while (sumS<100){
            System.out.print(sumS + " ");
            sumS+=7;

        }
    }

    public void sequenceFives () {
        System.out.println();
                int result=5;

        for (int i = 0; i < 10; i++) {
              result-=5;
            System.out.print(result + " ");
        }
    }

    public void squareOfNumber () {
        System.out.println();
        int z;
        for (z=10; z<=20; z++) {
            System.out.print(z*z +" ");
        }
    }

    public void fibonachi () {
        System.out.println();
        int a1 = 1;
        int a2 = 1;
        int a3;
        System.out.print(a1 + " " + a2 + " ");
        for (int i = 3; i<=11; i++){
            a3= a1 + a2;
            System.out.print(a3 + " ");
            a1 = a2;
            a2 = a3;
        }
    }

    public void bank() {
        System.out.println();
        System.out.println("Введите сумму вклада:");
        float size = in.nextFloat();
        System.out.println("Введите срок вклада в месяцах:");
        int term = in.nextInt();
        float income;
        for (int x = 1; x <= term; x++) {
            income = size * 7 / 100;
            size += income;
        }
        System.out.println("Итоговая сумма за период: " + size);
    }

    public void multiplicationTable (){
            for (int i = 1; i <= 9; i++){
            System.out.println(" ");
            for ( int x = 1 ; x <= 10 ; x++) {
                System.out.println(i + "*" + x + " = " + i*x + " "); //стандартная таблица умножения
            }
        }
        for (int i = 1; i <= 9; i++){
            System.out.println(" ");
            for ( int x = 1 ; x <= 10 ; x++) {
                System.out.print(i * x + "\t");    //таблица Пифагора
            }
        }
    }
}
