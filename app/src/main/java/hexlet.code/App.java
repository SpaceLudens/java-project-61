package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case (1):
                Cli.acquaintance();
                break;
            case (2):
                Even.evenGame();
                break;
            default:
                break;
        }
    }
}
