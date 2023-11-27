package hexlet.code.games;

import static hexlet.code.Engine.question;
import static hexlet.code.Engine.roundsCount;
import static hexlet.code.Engine.result;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Progression {

    public static void game() {
        for (int i = 0; i < roundsCount; i++) {

            StringBuilder str = new StringBuilder(" ");
            int firstRandomNumber = getRandomNumber(1, 100);
            int stepBetweenNumbers = getRandomNumber(1, 5);
            int randomSkippedNumber = getRandomNumber(0, 10);
            int stringLength = 10;

            for (int j = 0; j < stringLength; j++) {
                if (j == randomSkippedNumber) {
                    result[i] = String.valueOf(firstRandomNumber + stepBetweenNumbers);
                    str.append(".." + " ");
                } else {
                    str.append(firstRandomNumber + stepBetweenNumbers).append(" ");
                }
                firstRandomNumber = firstRandomNumber + stepBetweenNumbers;
            }
            question[i] = str.toString();
        }
        gameLauncher(3, question, result);
    }
}
