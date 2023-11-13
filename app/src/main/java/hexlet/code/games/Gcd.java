package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void gsdGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Engine.greeting();

        System.out.println("Find the greatest common divisor of given numbers.");

        while (Engine.count < 3) {
            int firstRandomNumber = random.nextInt(1, 100);
            int secondRandomNumber = random.nextInt(1, 100);
            int expressionResult = 0;
            boolean greep = true;
            int minNumber = Math.min(firstRandomNumber, secondRandomNumber);
            int maxNumber = Math.max(firstRandomNumber, secondRandomNumber);

            System.out.println("Question: " + firstRandomNumber + " " + secondRandomNumber + "\n Your answer: ");
            int answer = scanner.nextInt();

            while (greep) {
                if (maxNumber % minNumber == 0) {
                    expressionResult = minNumber;
                    greep = false;
                } else {
                    int remainder = maxNumber % minNumber;
                    maxNumber = minNumber;
                    minNumber = remainder;

                    if (remainder == 0) {
                        greep = false;
                    }
                }
            }

            if (answer == expressionResult) {
                System.out.println("Correct!");
                Engine.count++;
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;("
                        + " Correct answer was" + "'" + expressionResult + "'" + ".");
                break;
            }

            Engine.congratulations();
        }
    }
}
