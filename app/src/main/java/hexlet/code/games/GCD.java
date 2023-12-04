package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class GCD {
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";
    private static final String[] QUESTIONS = new String[getRoundsCount()];
    private static final String[] CORRECT_ANSWERS = new String[getRoundsCount()];
    public static String[] getQuestions() {
        return QUESTIONS;
    }

    public static String[] getCorrectAnswers() {
        return CORRECT_ANSWERS;
    }
    public static String gcd(int firstNumber, int secondNumber) {
        int remainder;
        boolean swap = true;
        String gcd = "1";
        while (swap) {
            if (firstNumber % secondNumber == 0) {
                gcd = String.valueOf(secondNumber);
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
        for (int i = 0; i < getRoundsCount(); i++) {
            int firstRandomNumber
                    = getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100);
            int secondRandomNumber
                    = getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100);
            int largerNumber = Math.max(firstRandomNumber, secondRandomNumber);
            int lowerNumber = Math.min(firstRandomNumber, secondRandomNumber);
            getQuestions()[i] = firstRandomNumber + " " + secondRandomNumber;
            getCorrectAnswers()[i] = gcd(largerNumber, lowerNumber);
        }
        gameLauncher(GAME_RULE, getQuestions(), getCorrectAnswers());
    }
}
