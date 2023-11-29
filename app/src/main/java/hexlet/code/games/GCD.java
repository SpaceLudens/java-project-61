package hexlet.code.games;

import static hexlet.code.Engine.getQuestion;
import static hexlet.code.Engine.getResult;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.Engine.NUMBERTOGENERATEARANDOMNUMBER1;
import static hexlet.code.Engine.NUMBERTOGENERATEARANDOMNUMBER100;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class GCD {

    public static void game() {
        for (int i = 0; i < getRoundsCount(); i++) {

            int firstRandomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            int secondRandomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
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
        gameLauncher(2, getQuestion(), getResult());
    }
}
