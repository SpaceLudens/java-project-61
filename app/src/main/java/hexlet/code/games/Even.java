package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Even {
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void game() {
        String[][] questionsAndCorrectAnswers = new String[3][2];
        final int randomMinValue1 = 1;
        final int randomMaxValue100 = 100;
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            for (int j = 0; j < questionsAndCorrectAnswers[i].length - 1; j++) {
                int randomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
                questionsAndCorrectAnswers[i][j] = String.valueOf(randomNumber);
                questionsAndCorrectAnswers[i][j + 1] = isEven(randomNumber) ? "yes" : "no";
            }
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
