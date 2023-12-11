package hexlet.code.games;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Prime {
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static boolean isPrime(int number) {
        boolean isPrime = false;
        if (number < 2) {
            return isPrime;
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
        String[][] questionsAndCorrectAnswers = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            int randomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
            questionsAndCorrectAnswers[i][0] = String.valueOf(randomNumber);
            questionsAndCorrectAnswers[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
