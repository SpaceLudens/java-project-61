package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;



import java.util.Scanner;

public class App {
    public static final int FIRSTGAME = 1;
    public static final int SECONDGAME = 2;
    public static final int THIRDGAME = 3;
    public static final int FOURTHGAME = 4;
    public static final int FIFTHGAME = 5;
    public static final int SIXTHGAME = 6;
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
            case FIRSTGAME -> Cli.acquaintance();
            case SECONDGAME -> Even.game();
            case THIRDGAME -> Calc.game();
            case FOURTHGAME -> GCD.game();
            case FIFTHGAME -> Progression.game();
            case SIXTHGAME -> Prime.game();
            default -> {
            }
        }
    }
}
