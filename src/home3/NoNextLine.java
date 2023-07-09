package home3;

import java.util.Scanner;

public class NoNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();

        // Оставляем во входном буфере оставшуюся часть строки. \Z
        scanner.useDelimiter("\\z");
        String string4 = scanner.next().trim();

        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);
        System.out.println("string3: " + string3);
        System.out.println("string4: " + string4);
    }
}


