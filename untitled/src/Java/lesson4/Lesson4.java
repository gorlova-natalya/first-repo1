package Java.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4 {

    Scanner in = new Scanner(System.in);

    public void enteringAnArray() {
        int[] array = {1, 3, 5, 7, 9, 11};
        System.out.println("Введите число: ");
        int value = in.nextInt();
        for (int x : array) {
            if (x == value) {
                System.out.println("Число входит в массив.");
                break;
            } else System.out.println("Число не входит в массив.");
            break;
        }
        System.out.println();
    }

    public void deleteElement() {
        int[] array = {1, 0, 1, 3, 7, 8, 9, 0, 11};
        System.out.println("Первоначальный массив" + Arrays.toString(array));
        System.out.println("Введите число для удаления:");
        int value = in.nextInt();
        int[] tempArray = new int[array.length];
        int j = 0;
        int[] newArray;
        for (int item : array) {
            if (item != value) {
                tempArray[j] = item;
                j++;
            }
        }
        newArray = new int[j];
        for (int k = 0; k < newArray.length; k++) {
            newArray[k] = tempArray[k];
        }
        System.out.print(Arrays.toString(newArray));
        System.out.println();
        System.out.println();
    }

    public void random() {
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * size);
        }
        System.out.print("Массив: " + Arrays.toString(array));
        System.out.println();
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальное значение массива: " + min);
        int sum = 0;
        int avr = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            avr = sum / array.length;
        }
        System.out.println("Среднее значение массива: " + avr);
        System.out.println();
    }

    public void comparingArrays() {
        int[] array1 = {5, 3, 1, 8, 0};
        int[] array2 = {7, 2, 0, 4, 9};
        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));
        double sum1 = 0;
        double sum2 = 0;
        for (int x : array1) {
            sum1 += x;
        }
        double avr1 = sum1 / array1.length;
        for (int x : array2) {
            sum2 += x;
        }
        double avr2 = sum2 / array2.length;
        System.out.println("Полученные средние значения " + avr1 + " и " + avr2);
        if (avr1 > avr2) {
            System.out.println("Среднее арифметическое первого массива больше, чем второго.");
        } else if (avr1 < avr2) {
            System.out.println("Среднее арифметическое второго массива больше, чем первого.");
        } else System.out.println("Средние арифметические равны.");
        System.out.println();
    }

    public void evenArray() {
        System.out.println("Введите размер массива (от 5 до 10): ");
        int n = in.nextInt();
        if (n > 10 || n < 5) {
            System.out.println("Введите значение из предложенного ранее диапазона: ");
            int x = in.nextInt();
            n = x;
        }
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n);
        }
        System.out.println("Массив: " + Arrays.toString(array));
        int[] tempArray = new int[array.length];
        int j = 0;
        int[] newArray;
        for (int value : array) {
            if (value % 2 == 0) {
                tempArray[j] = value;
                j++;
            }
        }
        newArray = new int[j];
        for (int k = 0; k < newArray.length; k++) {
            newArray[k] = tempArray[k];
        }
        System.out.print("Массив из четных: " + Arrays.toString(newArray));
        System.out.println();
        System.out.println();
    }

    public void oddIndex() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public void stringSort() {
        String[] names = new String[10];
        names[0] = "Dmitry";
        names[1] = "Alex";
        names[2] = "Ivan";
        names[3] = "Vlad";
        names[4] = "Olga";
        names[5] = "Elena";
        names[6] = "Marya";
        names[7] = "Evgeniy";
        names[8] = "Elizabeth";
        names[9] = "Inna";
        System.out.print("До сортировки: " + Arrays.toString(names) + " ");
        System.out.println();
        Arrays.sort(names);
        System.out.print("После сортировки: " + Arrays.toString(names) + " ");
        System.out.println();
        System.out.println();
    }

    public void sortBubble1() {
        int[] array = {5, 6, 1, 9, 3, 7, 4};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int sort = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sort;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}