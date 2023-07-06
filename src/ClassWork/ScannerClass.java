package ClassWork;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Ваше введенное число в квадрате:");
        int x = imput.nextInt();
        System.out.println("Ваше введенное число в квадрате:"+x*x);

        System.out.println("=========================");



    }
}
