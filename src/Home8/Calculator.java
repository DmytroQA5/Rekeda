package Home8;

import java.util.Scanner;

public class Calculator {
    /*Создать класс калькулятор.
В нем создать методы:
summ, minus, multiply, division.
Сложение, вычитание, умножение и деление соответственно.
Каждый метод принимает в качестве параметров два значения типа double.
И выводит в консоль результат действия.

Также в классе есть метод старт. Который выводит сообщение в консоль, что
калькулятор запущен. И предлагает ввести действие в вашей консоли.

Калькулятор должен принимать только следующие типы действий:
2+4;    - пример синтаксиса сложения;
5-6;    - пример синтаксиса вычитания;
25*3;   - пример синтаксиса умножения;
34/3;   - пример синтаксиса деления;

После ввода действия на консоль выводится ответ этого действия.
И после снова выводится сообщение о предложении ввести действие.

В случае ввода другого синтаксисана консоль возвращается сообщение:
"Введите корректное действие".
И после снова выводится сообщение о предложении ввести действие.

Программа закрывается после ввода команды Stop.
Перед закрытием на консоль должно выводится сообщение:
"Калькулятор закрыт".*/

        public void start() {
            System.out.println("Калькулятор запущен. Введите действие (например, 2+4), или введите 'Stop' для выхода.");
            Scanner scanner = new Scanner(System.in);
            String action;

            while (true) {
                action = scanner.nextLine();
                if (action.equalsIgnoreCase("Stop")) {
                    System.out.println("Калькулятор закрыт.");
                    break;
                }

                if (isValidAction(action)) {
                    double result = calculate(action);
                    System.out.println("Ответ: " + result);
                } else {
                    System.out.println("Введите корректное действие.");
                }

                System.out.println("Введите действие:");
            }
            scanner.close();
        }

        private boolean isValidAction(String action) {
            return action.matches("\\d+([+\\-*/]\\d+)");
        }

        private double calculate(String action) {
            char operator = action.charAt(action.length() - 2);
            double num1 = Double.parseDouble(action.substring(0, action.indexOf(operator)));
            double num2 = Double.parseDouble(action.substring(action.indexOf(operator) + 1, action.length()));

            switch (operator) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    return num1 / num2;
                default:
                    throw new IllegalArgumentException("Неподдерживаемое действие: " + action);
            }
        }

        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            calculator.start();
        }
}




