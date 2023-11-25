package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static String name;
    public static int roundsCount = 3;
    public static String[] question = new String[3];
    public static String[] result = new String[3];
    static Scanner scanner = new Scanner(System.in);
    public static boolean swap = true;
    public static int count = 0;
    public static int swapCount = 0;
    public static String gamesRules(int gameNumber) {
        String[] gamesRules = {
                "Answer 'yes' if the number is even, otherwise answer 'no'.",
                "What is the result of the expression?",
                "Find the greatest common divisor of given numbers.",
                "What number is missing in the progression?"};
        return gamesRules[gameNumber];
    }

    public static int getRandomNumber(int from, int to) {
        Random random = new Random();
        return random.nextInt(from,to);
    }


    public static void gameLauncher(int gameRulesNumber, String[] question, String[] userAnswer) {
        Cli.acquaintance();
        System.out.println(gamesRules(gameRulesNumber));
        while (swap) {
            System.out.println("Question: " + question[count]);
            System.out.print("Your answer: ");
            var answer = scanner.next();

            if (answer.equals(userAnswer[count])) {
                System.out.println("Correct!");
                swapCount++;
                count ++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. " + "Correct answer was '"
                        + userAnswer[count] + "'." + " Let's try again, " + name + "!");
                break;
            }
            if(swapCount == 3) {
                System.out.println("Congratulations, " + name + "!");
                swap = false;
            }
        }
    }

}






