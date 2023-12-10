package hexlet.code;

import java.util.Scanner;


public class Engine {
    private static String userName;
    private static final int ROUNDS_COUNT = 3;
    public static void gameLauncher(String gameRule, String[][] questionAndUserAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        setUserName(scanner.nextLine());
        System.out.println("Hello, " + userName + "!" + "\n" + gameRule);

        for (int i = 0; i < getRoundsCount(); i++) {
            System.out.print("Question: " + questionAndUserAnswer[i][0] + "\nYour answer: ");
            var answer = scanner.next();
            if (answer.equals(questionAndUserAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. " + "Correct answer was '"
                                   + questionAndUserAnswer[i][1] + "'." + " Let's try again, " + getUserName() + "!");
                i = getRoundsCount();
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + getUserName() + "!");
            }
        }
    }
    public static void setUserName(String name) {
        Engine.userName = name;
    }
    public static String getUserName() {
        return userName;
    }
    public static int getRoundsCount() {
        return ROUNDS_COUNT;
    }
}







