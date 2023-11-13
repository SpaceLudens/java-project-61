package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progressionGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];
        Engine.greeting();

        while (Engine.count < 3) {
            int firstRandomNumber = random.nextInt(100);
            int stepBetweenNumbers = random.nextInt(1, 10);
            int randomArrayNumber = random.nextInt(10);
            int expressionResult = 0;
            array[0] = firstRandomNumber;

            for (int i = 1; i < array.length; i++) {
                array[i] = firstRandomNumber + stepBetweenNumbers;
                firstRandomNumber = array[i];
            }

            System.out.println("What number is missing in the progression?");
            System.out.print("Question:");

            for (int i = 0; i < array.length; i++) {
                if (i == randomArrayNumber) {
                    expressionResult = array[i];
                    System.out.print(" " + "..");
                } else {
                    System.out.print(" " + array[i]);
                }
            }
            System.out.println("\nYour answer: ");
            int answer = scanner.nextInt();

            if (answer == expressionResult) {
                System.out.println("Correct!");
                Engine.count++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;("
                                   + " Correct answer was " + "'" + expressionResult + "'" + ".");
                break;
            }

            Engine.congratulations();
        }
    }
}
