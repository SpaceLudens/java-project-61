package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine.greeting();


        while (Engine.count < 3) {
            int randomNumber = random.nextInt(1, 100);
            boolean isPrimeNumber = true;

            for (int i = 2; i < randomNumber; i++) {
                if (randomNumber % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            System.out.println("Question: " + randomNumber + "\nYour answer: ");

            String answer = scanner.nextLine();

            if (answer.equals("yes") && isPrimeNumber) {
                System.out.println("Correct!");
                Engine.count++;
            } else if (answer.equals("no") && !isPrimeNumber) {
                System.out.println("Correct");
                Engine.count++;
            } else if (answer.equals("yes")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Engine.usrName + "!");
                break;
            } else if (answer.equals("no")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Engine.usrName + "!");
                break;
            }

            Engine.congratulations();

        }
    }
}
