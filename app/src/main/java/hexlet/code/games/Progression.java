package hexlet.code.games;

import static hexlet.code.App.THIRDGAME;
import static hexlet.code.Engine.*;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Progression {
public static final int STRINGLENGTH = 10;
    public static void game() {
        for (int i = 0; i < roundsCount; i++) {
            StringBuilder str = new StringBuilder();
            int firstRandomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            int stepBetweenNumbers = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER5);
            int randomSkippedNumber = getRandomNumber(0, NUMBERTOGENERATEARANDOMNUMBER10);

            for (int j = 0; j < STRINGLENGTH; j++) {
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
        gameLauncher(THIRDGAME, getQuestion(), getResult());
    }
}
