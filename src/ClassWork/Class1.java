package ClassWork;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Введите число (или введите 'FINAL' для завершения): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("FINAL")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число или 'FINAL'.");
            }
        }

        System.out.println("Конечная сумма: " + sum);
    }
}


