package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progressionGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];


        /*while (Engine.count < 3) {
            int firstRandomNumber = random.nextInt(100);
            int stepBetweenNumbers = random.nextInt(1, 10);
            int randomArrayNumber = random.nextInt(10);
            array[0] = firstRandomNumber;

            for (int i = 1; i < array.length; i++) {
                array[i] = firstRandomNumber + stepBetweenNumbers;
                firstRandomNumber = array[i];
            }

            System.out.println("What number is missing in the progression?");
            System.out.print("Question:");

            for (int i = 0; i < array.length; i++) {
                if (i == randomArrayNumber) {
                    Engine.expressionResult = array[i];
                    System.out.print(" " + "..");
                } else {
                    System.out.print(" " + array[i]);
                }
            }
            System.out.println("\nYour answer: ");
            Engine.answer = scanner.nextInt();

            if (Engine.answer == Engine.expressionResult) {
                System.out.println("Correct!");
                Engine.count++;
            } else {
                System.out.println("'" + Engine.answer + "'" + " is wrong answer ;("
                                   + " Correct answer was " + "'" + Engine.expressionResult + "'" + ".");
                break;
            }

            Engine.congratulations();
        }*/
    }
}
