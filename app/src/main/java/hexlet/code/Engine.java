package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void gameLauncher(String gameRule, String[][] questionAndUserAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!" + "\n" + gameRule);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.print("Question: " + questionAndUserAnswer[i][0] + "\nYour answer: ");
            var answer = scanner.next();
            if (answer.equals(questionAndUserAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. " + "Correct answer was '"
                                   + questionAndUserAnswer[i][1] + "'." + " Let's try again, " + userName + "!");
                i = ROUNDS_COUNT;
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}








