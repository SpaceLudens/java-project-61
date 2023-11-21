
package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class Even implements Game {
    static Scanner scanner = new Scanner(System.in);
    static Even even = new Even();
    static Random random = new Random();
    public static boolean swap = true;
    public static int roundCount = 0;

    public static void main(String[] args) {
        Game game = new Game() {
            public static void game() {
                int randomNumber = random.nextInt(1,100);
                boolean isEven = randomNumber % 2 == 0;
                System.out.println("Question: " + randomNumber);
                System.out.print("Your answer: ");
                String answer = scanner.nextLine();
                if (answer.equals("yes") && isEven) {
                    System.out.println("Correct!");
                    roundCount++;
                } else if (answer.equals("no") && !isEven) {
                    System.out.println("Correct!");
                    roundCount++;
                } else if (answer.equals("no")) {
                    System.out.println(" 'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                            "Let's try again, " + Engine.name + "!");
                    //break;
                } else if (answer.equals("yes")) {
                    System.out.println(" 'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                            "Let's try again, " + Engine.name + "!");
                    //break;
                }

            }
        };
        Engine.gameLauncher(1, game);
    }
}