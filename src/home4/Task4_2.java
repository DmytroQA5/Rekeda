package home4;

import java.util.Scanner;

public class Task4_2 {
    /* Написать программу в которой пользователь вводит с клавиатуры число,
     а программа определяет, является она полиндромом или нет.
     И выводит данную информацию на экран.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Число является палиндромом.");
        } else {
            System.out.println("Число не является палиндромом.");
        }
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}

