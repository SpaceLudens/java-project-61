package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Prime {
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final String[] QUESTIONS = new String[getRoundsCount()];
    private static final String[] CORRECT_ANSWERS = new String[getRoundsCount()];
    public static boolean isPrime(int number) {
        boolean isPrime = false;
        if (number < 2) {
            return false;
        }

        for (int j = 2; j <= number; j++) {
            if (number % j == 0 && number != j) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
    public static void game() {
        for (int i = 0; i < getRoundsCount(); i++) {
            int randomNumber
                    = getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100);
            getQuestions()[i] = String.valueOf(randomNumber);
            getCorrectAnswers()[i] = isPrime(randomNumber) ? "yes" : "no";
        }
        gameLauncher(GAME_RULE, getQuestions(), getCorrectAnswers());
    }

    public static String[] getQuestions() {
        return QUESTIONS;
    }

    public static String[] getCorrectAnswers() {
        return CORRECT_ANSWERS;
    }
}
