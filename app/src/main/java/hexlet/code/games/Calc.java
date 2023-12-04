package hexlet.code.games;

import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_4;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Calc {
    private static final String GAME_RULE = "What is the result of the expression?";
    private static final String[] QUESTIONS = new String[getRoundsCount()];
    private static final String[] CORRECT_ANSWERS = new String[getRoundsCount()];
    private static final int VAR_1 = 1;
    private static final int VAR_2 = 2;
    private static final int VAR_3 = 3;
    public static String[] getQuestions() {
        return QUESTIONS;
    }

    public static String[] getCorrectAnswers() {
        return CORRECT_ANSWERS;
    }

    public static void game() {
        for (int i = 0; i < getRoundsCount(); i++) {
            int rand = getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_4);
            int firstRandomNumber =
                    getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100);
            int secondRandomNumber =
                    getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100);
            if (rand == VAR_1) {
                getQuestions()[i] = firstRandomNumber + " + " + secondRandomNumber;
                getCorrectAnswers()[i] = String.valueOf(firstRandomNumber + secondRandomNumber);
            } else if (rand == VAR_2) {
                getQuestions()[i] = firstRandomNumber + " - " + secondRandomNumber;
                getCorrectAnswers()[i] = String.valueOf(firstRandomNumber - secondRandomNumber);
            } else if (rand == VAR_3) {
                getQuestions()[i] = firstRandomNumber + " * " + secondRandomNumber;
                getCorrectAnswers()[i] = String.valueOf(firstRandomNumber * secondRandomNumber);
            }
        }
        gameLauncher(GAME_RULE, getQuestions(), getCorrectAnswers());
    }
}
