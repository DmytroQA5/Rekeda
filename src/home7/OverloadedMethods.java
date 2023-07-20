package home7;

public class OverloadedMethods {
    public void printMessage() {
        System.out.println("Я пустой");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printArray(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String item : arr) {
            sb.append(item).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public void printSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public void printMessageAndNumber(int number, String message) {
        System.out.println("Ваше сообщение - " + message + ", ваше число - " + number);
    }
}
