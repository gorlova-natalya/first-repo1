package Java.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5 {

    Scanner in = new Scanner(System.in);

    public void increasingArray() {
        int[][][] array = {{{2, 2, 4, 4}, {1, 1, 1, 10}}, {{0, 3, 4, 6}, {3, 5, 1, 0}}, {{3, 4, 1, 0}, {0, 5, 6, 3}}};
        System.out.println("Массив: " + Arrays.deepToString(array));
        System.out.println("Введите число, на которое увеличится массив: ");
        int value = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = array[i][j][k] + value;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void chessBoard() {
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else board[i][j] = "B";
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void matrixMultiplication() {
        int[][] matrix1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int row1 = matrix1[0].length;
        int row2 = matrix2[0].length;
        int column1 = matrix1.length;
        int column2 = matrix2.length;
        int[][] result = new int[3][3];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column1; j++) {
                for (int k = 0; k < column2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.print("Результат умножения матриц " + Arrays.deepToString(result));
        System.out.println();
    }

    public void sumArrayElements() {
        int[][] array = {{2, 2, 4, 4}, {1, 1, 1, 10}, {0, 3, 4, 6}};
        System.out.println();
        System.out.println("Массив: " + Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println();
    }

    public void diagonals() {
        int[][] array = {{5, 2, 4, 7}, {1, 1, 10, 15}, {3, 4, 6, 1}, {6, 1, 5, 4}};
        System.out.println("Массив: " + Arrays.deepToString(array));
        System.out.print("Левая диагональ: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.print("Правая диагональ: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - i - 1] + " ");
        }
        System.out.println();
    }

    public void sortArrayElements() {
        int[][] array = {{5, 2, 4, 7}, {1, 1, 10, 15}, {3, 4, 6, 1}, {6, 1, 5, 4}};
        System.out.println();
        System.out.println("Массив: " + Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println("Отсортированный массив: " + Arrays.deepToString(array));
    }
}