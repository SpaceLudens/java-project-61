package hexlet.code;

import java.util.Scanner;

import static hexlet.code.GameRules.*;

public class Engine {
    public static String name;
    public static int roundsCount = 3;
    public static String[] question = new String[roundsCount];
    public static String[] result = new String[roundsCount];
    static Scanner scanner = new Scanner(System.in);
    public static boolean swap = true;

    public static void gameLauncher(int gameRulesNumber, String[] question, String[] userAnswer) {
        Cli.acquaintance();
        System.out.println(gamesRules(gameRulesNumber));
        for (int i = 0; i < roundsCount;) {
            System.out.print("Question: " + question[i] + "\nYour answer: ");
            var answer = scanner.next();
            if (answer.equals(userAnswer[i])) {
                System.out.println("Correct!");
                i ++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. " + "Correct answer was '"
                        + userAnswer[i] + "'." + " Let's try again, " + name + "!");
                break;
            }
            if(i == roundsCount) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}






