package home6;

import java.util.Scanner;

public class Task6_2 {
    /* Написати програму "стрільба по цілі".
                      Технічні вимоги:
	Даний квадрат 5х5, де програма випадковим чином ставить ціль.
	Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
	Сам процес гри обробляється у нескінченному циклі.
	гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число,
 і введена лінія знаходиться в межах ігрового поля (1-5).
У випадку, якщо гравець помилився, пропонує ввести число ще раз.
	Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
	Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі.
 Клітинки, куди гравець вже стріляв, слід зазначити як *.
	Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!,
 а також ігрове поле. Уражену ціль відзначити як x.
Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).*/
    public static void main(String[] args) {
        char[][] gameBoard = new char[5][5];
        initializeGameBoard(gameBoard);

        System.out.println("All Set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the row (1-5): ");
            int row = getValidInput(scanner);

            System.out.print("Enter the column (1-5): ");
            int column = getValidInput(scanner);

            if (gameBoard[row - 1][column - 1] == 'x') {
                System.out.println("You have won!");
                break;
            } else {
                gameBoard[row - 1][column - 1] = '*';
                printGameBoard(gameBoard);
            }
        }
    }

    private static void initializeGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = '-';
            }
        }

        int targetRow = (int) (Math.random() * 5);
        int targetColumn = (int) (Math.random() * 5);
        gameBoard[targetRow][targetColumn] = 'x';
    }

    private static void printGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getValidInput(Scanner scanner) {
        int input;
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= 5) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.print("Invalid input. Please enter a number between 1 and 5: ");
        }
        return input;
    }

}
