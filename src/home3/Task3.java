package home3;

import java.util.Scanner;

public class Task3 {
    /* У вас есть строка “Я тестирую замечательно. Что еще нужно?”,
     которую нужно ввести с клавиатуры в консоль.
    Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine())
    присвоить перемнным типа String следующие значения:
     string1 = Я string2 = тестирую string3 = замечательно string4 = Что еще нужно?
     Помимо string1, string2, string3, string4 новых переменных создавать нельзя.*/

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите строку:");
            String string1 = scanner.next();
            String string2 = scanner.next();
            String string3 = scanner.next();
            String string4 = scanner.next() + scanner.nextLine();

            System.out.println("string1: " + string1);
            System.out.println("string2: " + string2);
            System.out.println("string3: " + string3);
            System.out.println("string4: " + string4.trim());
        }
}