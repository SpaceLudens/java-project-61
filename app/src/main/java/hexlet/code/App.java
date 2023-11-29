package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;



import java.util.Scanner;

public class App {
    public static final int firstGame = 1;
    public static final int secondGame = 2;
    public static final int thirdGame = 3;
    public static final int fourthGame = 4;
    public static final int fifthGame = 5;
    public static final int sixthGame = 6;
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
            case firstGame -> Cli.acquaintance();
            case secondGame -> Even.game();
            case thirdGame -> Calc.game();
            case fourthGame -> GCD.game();
            case fifthGame -> Progression.game();
            case sixthGame -> Prime.game();
            default -> {
            }
        }
    }
}
