package hexlet.code.games;

import static hexlet.code.Engine.*;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class GCD {

    public static void game() {
        for (int i = 0; i < roundsCount; i++) {

            int firstRandomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            int secondRandomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            int largerNumber = Math.max(firstRandomNumber, secondRandomNumber);
            int lowerNumber = Math.min(firstRandomNumber, secondRandomNumber);
            int remainder;
            swap = true;

            while (swap) {
                if (largerNumber % lowerNumber == 0) {
                    question[i] = firstRandomNumber + " " + secondRandomNumber;
                    result[i] = String.valueOf(lowerNumber);
                    swap = false;
                } else {
                    remainder = largerNumber % lowerNumber;
                    largerNumber = lowerNumber;
                    lowerNumber = remainder;
                }
            }
        }
        gameLauncher(2, question, result);
    }
}
