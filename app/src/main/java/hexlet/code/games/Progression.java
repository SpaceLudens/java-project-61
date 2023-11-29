package hexlet.code.games;

import static hexlet.code.Engine.*;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Progression {

    public static void game() {
        for (int i = 0; i < roundsCount; i++) {
            StringBuilder str = new StringBuilder();
            int firstRandomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            int stepBetweenNumbers = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER5);
            int randomSkippedNumber = getRandomNumber(0, NUMBERTOGENERATEARANDOMNUMBER10);
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
