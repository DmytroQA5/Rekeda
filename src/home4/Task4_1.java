package home4;

import java.util.Scanner;

public class Task4_1 {
    /*Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова,
     и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP.
    Все слова введенные до этого должны отобразится в консоли одним предложением.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder userInput = new StringBuilder();

        while (true) {
            System.out.print("Введите слово (или 'STOP' для завершения): ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("STOP")) {
                break;
            }

            userInput.append(word).append(" ");
        }

        System.out.println("Предложение: " + userInput.toString().trim());
    }
}



