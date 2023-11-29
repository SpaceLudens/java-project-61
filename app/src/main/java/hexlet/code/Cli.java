package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Engine.getNAME;
import static hexlet.code.Engine.setNAME;

public class Cli {

    public static void acquaintance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        setNAME(scanner.nextLine());
        System.out.println("Hello, " + getNAME() + "!");
    }
}
