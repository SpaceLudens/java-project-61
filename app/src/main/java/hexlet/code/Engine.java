package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int count = 0;
    public static String usrName;




    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        usrName = scanner.nextLine();
        System.out.println("Hello, " + usrName + "!");
    }

    public static void congratulations() {
        if (Engine.count == 3) {
            System.out.println("Congratulations," + Engine.usrName + "!");
        }
    }
}
