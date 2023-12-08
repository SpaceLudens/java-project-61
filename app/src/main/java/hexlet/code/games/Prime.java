package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Prime {
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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
        String[][] questionsAndCorrectAnswers = new String[3][2];
        int randMinValue_1 = 1;
        int randMaxValue_100 = 100;
        for (int i = 0; i < getRoundsCount(); i++) {
            for (int j = 0; j < questionsAndCorrectAnswers[i].length - 1; j++) {
                int randomNumber = getRandomNumber(randMinValue_1, randMaxValue_100);
                questionsAndCorrectAnswers[i][j] = String.valueOf(randomNumber);
                questionsAndCorrectAnswers[i][j + 1] = isPrime(randomNumber) ? "yes" : "no";
            }

        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
