package hexlet.code.games;

import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_10;

import static hexlet.code.RandomNumbers.getRandomNumber;

public class Even {
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[] questions = new String[getRoundsCount()];
    private static  String[] correctAnswers = new String[getRoundsCount()];
    public static void game() {
        for (int i = 0; i < getRoundsCount(); i++) {
            int randomNumber = getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_10);
            questions[i] = Integer.toString(randomNumber);
            correctAnswers[i] = randomNumber % 2 == 0 ? "yes" : "no";
        }
    }
}
