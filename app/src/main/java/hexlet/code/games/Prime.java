package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Prime {
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int ARRAYS_COUNT = 3;
    private static final int ARRAYS_LENGTH = 2;


    private static boolean isPrime(int number) {
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

    public static void play() {
        final int randomMinValue1 = 1;
        final int randomMaxValue100 = 100;
        String[][] questionsAndCorrectAnswers = new String[ARRAYS_COUNT][ARRAYS_LENGTH];
        for (int i = 0; i < getRoundsCount(); i++) {
            int randomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
            questionsAndCorrectAnswers[i][0] = String.valueOf(randomNumber);
            questionsAndCorrectAnswers[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
