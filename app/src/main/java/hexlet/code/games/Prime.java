package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();



        /*while (Engine.count < 3) {
            int randomNumber = random.nextInt(1, 100);
            boolean isPrimeNumber = true;

            for (int i = 2; i < randomNumber; i++) {
                if (randomNumber % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            System.out.println("Question: " + randomNumber + "\nYour answer: ");

            Engine.yesOrNot = scanner.nextLine();

            if (Engine.yesOrNot.equals("yes") && isPrimeNumber) {
                System.out.println("Correct!");
                Engine.count++;
            } else if (Engine.yesOrNot.equals("no") && !isPrimeNumber) {
                System.out.println("Correct!");
                Engine.count++;
            } else if (Engine.yesOrNot.equals("yes")) {
                System.out.println("'" + Engine.yesOrNot + "'" + " is wrong answer ;(. Correct answer was 'no'."
                        + "\nLet's try again, " + Engine.usrName + "!");
                break;
            } else if (Engine.yesOrNot.equals("no")) {
                System.out.println("'" + Engine.yesOrNot + "'" + " is wrong answer ;(. Correct answer was 'yes'."
                        + "\nLet's try again, " + Engine.usrName + "!");
                break;
            }
            Engine.congratulations();
        }*/
    }
}
