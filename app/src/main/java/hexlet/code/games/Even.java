package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Even {
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void game() {
        final int arraysCount = 3;
        final int arraysLength = 2;
        final int randomMinValue1 = 1;
        final int randomMaxValue100 = 100;
        String[][] questionsAndCorrectAnswers = new String[arraysCount][arraysLength];
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            int randomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
            questionsAndCorrectAnswers[i][0] = String.valueOf(randomNumber);
            questionsAndCorrectAnswers[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
