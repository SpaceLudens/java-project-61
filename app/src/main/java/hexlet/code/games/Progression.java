package hexlet.code.games;

import static hexlet.code.Engine.getQuestion;
import static hexlet.code.Engine.getResult;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_5;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_10;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Progression {
    private static final String GAME_RULE = "What number is missing in the progression?";
    public static final int STRING_LENGTH = 10;
    public static void game() {
        for (int i = 0; i < getRoundsCount(); i++) {
            StringBuilder str = new StringBuilder();
            int firstRandomNumber = getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100);
            int stepBetweenNumbers = getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_5);
            int randomSkippedNumber = getRandomNumber(0, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_10);

            for (int j = 0; j < STRING_LENGTH; j++) {
                if (j == randomSkippedNumber) {
                    getResult()[i] = String.valueOf(firstRandomNumber + stepBetweenNumbers);
                    str.append(".." + " ");
                } else {
                    str.append(firstRandomNumber + stepBetweenNumbers).append(" ");
                }
                firstRandomNumber = firstRandomNumber + stepBetweenNumbers;
            }
            getQuestion()[i] = str.toString();
        }
        gameLauncher(GAME_RULE, getQuestion(), getResult());
    }
}
