package hexlet.code.games;

import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.Engine.GENERATE_A_RANDOM_NUMBER_1;
import static hexlet.code.Engine.GENERATE_A_RANDOM_NUMBER_100;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Even {
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final String[] QUESTIONS = new String[getRoundsCount()];
    private static final String[] CORRECT_ANSWERS = new String[getRoundsCount()];
    public static String[] getQuestions() {
        return QUESTIONS;
    }

    public static String[] getCorrectAnswers() {
        return CORRECT_ANSWERS;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void game() {
        for (int i = 0; i < getRoundsCount(); i++) {
            int randomNumber = getRandomNumber(GENERATE_A_RANDOM_NUMBER_1, GENERATE_A_RANDOM_NUMBER_100);
            getQuestions()[i] = String.valueOf(randomNumber);
            getCorrectAnswers()[i] = isEven(randomNumber) ? "yes" : "no";
        }
        gameLauncher(GAME_RULE, getQuestions(), getCorrectAnswers());
    }
}
