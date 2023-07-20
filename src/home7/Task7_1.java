package home7;

import java.util.List;
import java.util.ArrayList;
public class Task7_1 {
    /*Написать метод, принимающий в качестве параметра массив целых чисел.
     И выводит на экран все четные числа списком, a также нечетные числа списком.*/
    public static void printEvenAndOddNumbers(int[] arr) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        System.out.println("Четные числа: " + evenNumbers);
        System.out.println("Нечетные числа: " + oddNumbers);
    }
}
