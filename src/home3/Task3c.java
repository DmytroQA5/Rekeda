package home3;

import java.util.Scanner;

public class Task3c {
    public static void main(String[] args) {
        Scanner read_console = new Scanner(System.in);

        System.out.println("Введите число:");
        int a = read_console.nextInt();
        if( a==1 ){
            System.out.println("Понедельник");
        }else if(a==2){
            System.out.println("Вторник");
        }else if(a==3){
            System.out.println("Среда");
        }else if(a==4){
            System.out.println("Четверг");
        }else if(a==5){
            System.out.println("Пятница");
        }else if(a==6){
            System.out.println("Суббота");
        }else if(a==7){
            System.out.println("Воскресенье");
        }else {
            System.out.println("Лучше бы сегодня была пятница");
        }


    }
}
