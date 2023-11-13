package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void gsdGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Find the greatest common divisor of given numbers.");

        /*while (Engine.count < 3) {
            int firstRandomNumber = random.nextInt(1, 100);
            int secondRandomNumber = random.nextInt(1, 100);
            boolean greep = true;
            int minNumber = Math.min(firstRandomNumber, secondRandomNumber);
            int maxNumber = Math.max(firstRandomNumber, secondRandomNumber);

            System.out.println("Question: " + firstRandomNumber + " " + secondRandomNumber + "\nYour answer: ");
            Engine.answer = scanner.nextInt();

            while (greep) {
                if (maxNumber % minNumber == 0) {
                    Engine.expressionResult = minNumber;
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

            if (Engine.answer == Engine.expressionResult) {
                System.out.println("Correct!");
                Engine.count++;
            } else {
                System.out.println("'" + Engine.answer + "'" + " is wrong answer ;(."
                        + " Correct answer was " + "'" + Engine.expressionResult + "'" + "."
                        + "\nLet's try again, " + Engine.usrName + "!");
                break;
            }

            Engine.congratulations();
        }*/
    }
}
