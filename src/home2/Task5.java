package home2;

public class Task5 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0,34);
        String string3 = string2 + " this line that don't want to cut, cause it is perfect";

        System.out.println("string2: " + string2 + ", длина: " + string2.length());
        System.out.println("string3: " + string3 + ", длина: " + string3.length());

    }
}
