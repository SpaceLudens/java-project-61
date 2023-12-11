package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class GCD {
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";
    private static final int ARRAYS_COUNT = 3;
    private static final int ARRAYS_LENGTH = 2;

    private static int gcd(int firstNumber, int secondNumber) {
        int remainder;
        boolean swap = true;
        int gcd = 0;
        while (swap) {
            if (firstNumber % secondNumber == 0) {
                gcd = secondNumber;
                swap = false;
            } else {
                remainder = firstNumber % secondNumber;
                firstNumber = secondNumber;
                secondNumber = remainder;
            }
        }
        return gcd;
    }

    public static void play() {
        final int randomMinValue1 = 1;
        final int randomMaxValue100 = 100;
        String[][] questionsAndCorrectAnswers = new String[ARRAYS_COUNT][ARRAYS_LENGTH];

        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
                int firstRandomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
                int secondRandomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
                int largerNumber = Math.max(firstRandomNumber, secondRandomNumber);
                int lowerNumber = Math.min(firstRandomNumber, secondRandomNumber);
                questionsAndCorrectAnswers[i][0] = firstRandomNumber + " " + secondRandomNumber;
                questionsAndCorrectAnswers[i][1] = String.valueOf(gcd(largerNumber, lowerNumber));
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
