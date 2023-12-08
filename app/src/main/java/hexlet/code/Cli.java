package hexlet.code;

import java.util.Scanner;
public class Cli {

    public static void acquaintance() {
        String userName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
