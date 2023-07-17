package home6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6_1 {
    /* Пользователь задает размерность двумерного массива с клавиатуры.
    Массив заполняется случайными числами от 0 до 1000.
    Необходимо создать одномерный массив, состоящий из максимальных значений
    каждого отдельного массива входящего в двумерный.
    Новый полученный массив вывести на экран.*/

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк двумерного массива: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов двумерного массива: ");
        int columns = scanner.nextInt();

        int[][] array = generateRandomArray(rows, columns);
        System.out.println("Двумерный массив:");
        printArray(array);

        int[] maxValuesArray = getMaxValuesArray(array);
        System.out.println("Одномерный массив с максимальными значениями:");
        System.out.println(Arrays.toString(maxValuesArray));
    }

    private static int[][] generateRandomArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(1001);
            }
        }

        return array;
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[] getMaxValuesArray(int[][] array) {
        int[] maxValuesArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            maxValuesArray[i] = max;
        }

        return maxValuesArray;
    }

}
