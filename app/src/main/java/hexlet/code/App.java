package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;



import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 1 -> Cli.acquaintance();
            case 2 -> Even.game();
            case 3 -> Calc.game();
            case 4 -> GCD.game();
            case 5 -> Progression.game();
            case 6 -> Prime.game();
            default -> {
            }
        }
    }
}
