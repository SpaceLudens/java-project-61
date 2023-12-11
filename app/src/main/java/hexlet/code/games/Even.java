package hexlet.code.games;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Even {
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void play() {
        final int randomMinValue1 = 1;
        final int randomMaxValue100 = 100;
        String[][] questionsAndCorrectAnswers = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            var randomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
            questionsAndCorrectAnswers[i][0] = String.valueOf(randomNumber);
            questionsAndCorrectAnswers[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
