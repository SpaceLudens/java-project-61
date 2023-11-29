package hexlet.code;

import java.util.Scanner;

import static hexlet.code.GameRules.gamesRules;

public class Engine {
    private static String username;
    private static final int ROUNDSCOUNT = 3;
    private static final String[] QUESTION = new String[getRoundsCount()];
    private static final String[] RESULT = new String[getRoundsCount()];
    private static final Scanner SCANNER = new Scanner(System.in);
    public static final int NUMBERTOGENERATEARANDOMNUMBER1 = 1;
    public static final int NUMBERTOGENERATEARANDOMNUMBER4 = 4;
    public static final int NUMBERTOGENERATEARANDOMNUMBER5 = 5;
    public static final int NUMBERTOGENERATEARANDOMNUMBER10 = 10;
    public static final int NUMBERTOGENERATEARANDOMNUMBER100 = 100;


    public static void gameLauncher(int gameRulesNumber, String[] question, String[] userAnswer) {
        Cli.acquaintance();
        System.out.println(gamesRules(gameRulesNumber));
        for (int i = 0; i < getRoundsCount();) {
            System.out.print("Question: " + question[i] + "\nYour answer: ");
            var answer = SCANNER.next();
            if (answer.equals(userAnswer[i])) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. " + "Correct answer was '"
                        + userAnswer[i] + "'." + " Let's try again, " + getUserName() + "!");
                break;
            }
            if (i == getRoundsCount()) {
                System.out.println("Congratulations, " + getUserName() + "!");
            }
        }
    }

    public static String[] getQuestion() {
        return QUESTION;
    }

    public static String[] getResult() {
        return RESULT;
    }

    public static void setUserName(String name) {
        Engine.username = name;
    }
    public static String getUserName() {
        return username;
    }
    public static int getRoundsCount() {
        return ROUNDSCOUNT;
    }
}







