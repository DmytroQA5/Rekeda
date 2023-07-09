package home3;

import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        Scanner read_console = new Scanner(System.in);

        System.out.println("Введите три числа:");
        int a = read_console.nextInt() ;
        int b = read_console.nextInt() ;
        int c = read_console.nextInt() ;
        if( (a+b>=c) && (a + c >= b) &&  (b + c >= a) ) {
           System.out.println("Треугольник существует:");
        }else{
            System.out.println("Треугольник не существует:");
        }




    }
}
