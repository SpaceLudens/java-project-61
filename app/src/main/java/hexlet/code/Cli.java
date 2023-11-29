package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Engine.getUserName;
import static hexlet.code.Engine.setUserName;

public class Cli {

    public static void acquaintance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        setUserName(scanner.nextLine());
        System.out.println("Hello, " + getUserName() + "!");
    }
}
