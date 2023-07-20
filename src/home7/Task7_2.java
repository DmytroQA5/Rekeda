package home7;

public class Task7_2 {
    /*Написать перегруженный метод, который может:

•	Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
•	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
•	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
•	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
•	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
"Ваше сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/
    public static void main(String[] args) {
        OverloadedMethods om = new OverloadedMethods();

        om.printMessage();

        om.printMessage("Привет,пока норм?");

        String[] strArray = {"Java", "программирования", "перегрузка", "методов"};
        om.printArray(strArray);

        int[] intArray = {1,4,6,7,9};
        om.printSum(intArray);

        int number = 30;
        String customMessage = "Мое сообщение с числом";
        om.printMessageAndNumber(number, customMessage);
    }
}