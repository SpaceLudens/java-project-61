package hexlet.code.games;

import static hexlet.code.Engine.getQuestion;
import static hexlet.code.Engine.getResult;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1;
import static hexlet.code.Engine.NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class GCD {
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";
    public static void game() {
        for (int i = 0; i < getRoundsCount(); i++) {

            int firstRandomNumber = getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100);
            int secondRandomNumber = getRandomNumber(NUMBER_TO_GENERATE_A_RANDOM_NUMBER_1, NUMBER_TO_GENERATE_A_RANDOM_NUMBER_100);
            int largerNumber = Math.max(firstRandomNumber, secondRandomNumber);
            int lowerNumber = Math.min(firstRandomNumber, secondRandomNumber);
            int remainder;
            boolean swap = true;

            while (swap) {
                if (largerNumber % lowerNumber == 0) {
                    getQuestion()[i] = firstRandomNumber + " " + secondRandomNumber;
                    getResult()[i] = String.valueOf(lowerNumber);
                    swap = false;
                } else {
                    remainder = largerNumber % lowerNumber;
                    largerNumber = lowerNumber;
                    lowerNumber = remainder;
                }
            }
        }
        gameLauncher(GAME_RULE, getQuestion(), getResult());
    }
}
