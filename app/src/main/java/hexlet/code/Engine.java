package hexlet.code;

import java.util.Scanner;


public class Engine {
    private static String username;
    private static final int ROUNDS_COUNT = 3;
    private static final String[] QUESTION = new String[getRoundsCount()];
    private static final String[] RESULT = new String[getRoundsCount()];
    private static final Scanner SCANNER = new Scanner(System.in);
    public static final int NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1 = 1;
    public static final int NUMBER_TO_GENERATE_A_RANDOM_NUMBER_4 = 4;
    public static final int NUMBER_TO_GENERATE_A_RANDOM_NUMBER_5 = 5;
    public static final int NUMBER_TO_GENERATE_A_RANDOM_NUMBER_10 = 10;
    public static final int NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100 = 100;


    public static void gameLauncher(String gameRule, String[] question, String[] userAnswer) {
        Cli.acquaintance();
        System.out.println(gameRule);
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
        return ROUNDS_COUNT;
    }
}







