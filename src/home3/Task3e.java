package home3;

import java.util.Scanner;

public class Task3e {
    public static void main(String[] args) {
        Scanner read_console = new Scanner(System.in);

        System.out.println("Какая программа вам интересна:");
        System.out.println("1) IntelliJ IDEA");
        System.out.println("2) Git");
        System.out.println("3) Java");
        int a = read_console.nextInt();

        System.out.println("Какую ОС вы используете:");
        System.out.println("1) Linux");
        System.out.println("2) macOS");
        System.out.println("3) Windows");
        int b = read_console.nextInt();

        switch(a){
            case 1 : switch(b){
                        case 1 : System.out.println("IntelliJ IDEA - Linux"); break;
                        case 2 : System.out.println("IntelliJ IDEA - macOS"); break;
                        case 3 : System.out.println("IntelliJ IDEA - Windows"); break;
                        default: System.out.println("ОС не существует");
                    }
                    break;

            case 2 : switch(b){
                            case 1 : System.out.println("Git - Linux"); break;
                            case 2 : System.out.println("Git - macOS"); break;
                            case 3 : System.out.println("Git - Windows"); break;
                            default: System.out.println("ОС не существует");
                        }
                        break;

            case 3 : switch(b){
                            case 1 : System.out.println("Java - Linux"); break;
                            case 2 : System.out.println("Java - macOS"); break;
                            case 3 : System.out.println("Java - Windows"); break;
                            default: System.out.println("ОС не существует");
                        }
                        break;


            default: System.out.println("программы не существует");

        }


    }
}
