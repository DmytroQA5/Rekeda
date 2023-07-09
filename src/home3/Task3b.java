package home3;

import java.util.Scanner;

public class Task3b {
    public static void main(String[] args) {
        Scanner read_console = new Scanner(System.in);

        System.out.println("Введите два числа:");
        int a = read_console.nextInt();
        int b = read_console.nextInt();
        System.out.println("Результат:" +( a > b ? a-b : b-a ) );
    }
}
