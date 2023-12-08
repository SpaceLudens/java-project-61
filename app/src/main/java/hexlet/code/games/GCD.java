package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class GCD {
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";
    public static int gcd(int firstNumber, int secondNumber) {
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
    public static void game() {
        String[][] questionsAndCorrectAnswers = new String[3][2];
        final int randomMinValue1 = 1;
        final int randomMaxValue100 = 100;
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            for (int j = 0; j < questionsAndCorrectAnswers[i].length - 1; j++) {
                int firstRandomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
                int secondRandomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
                int largerNumber = Math.max(firstRandomNumber, secondRandomNumber);
                int lowerNumber = Math.min(firstRandomNumber, secondRandomNumber);
                questionsAndCorrectAnswers[i][j] = firstRandomNumber + " " + secondRandomNumber;
                questionsAndCorrectAnswers[i][j + 1] = String.valueOf(gcd(largerNumber, lowerNumber));
            }
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }

    public static void main(String[] args) {
        game();
    }
}
