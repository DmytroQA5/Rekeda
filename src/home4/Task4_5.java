package home4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4_5 {
    /* Есть одномерный массив из 10 элементов, заполнен- ный случайными числами.
    Пользователь вводит с клавиатуры число.
     Программа показывает есть ли такое число в созданном до этого массиве.
     */
    public static void main(String[] args) {
        int[] array = generateRandomArray(10);
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int searchNumber = scanner.nextInt();

        boolean found = false;

        for (int number : array) {
            if (number == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + searchNumber + " найдено в массиве.");
        } else {
            System.out.println("Число " + searchNumber + " не найдено в массиве.");
        }
    }

    private static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}


