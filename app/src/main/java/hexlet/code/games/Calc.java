package hexlet.code.games;

import static hexlet.code.Engine.*;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Calc {
    public static void game() {
        for (int i = 0; i < roundsCount; i++) {
            int rand = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER4);
            int firstRandomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            int secondRandomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            if (rand == 1) {
                getQuestion()[i] = firstRandomNumber + " + " + secondRandomNumber;
                getResult()[i] = String.valueOf(firstRandomNumber + secondRandomNumber);
            } else if (rand == 2) {
                getQuestion()[i] = firstRandomNumber + " - " + secondRandomNumber;
                getResult()[i] = String.valueOf(firstRandomNumber - secondRandomNumber);
            } else if (rand == 3) {
                getQuestion()[i] = firstRandomNumber + " * " + secondRandomNumber;
                getResult()[i] = String.valueOf(firstRandomNumber * secondRandomNumber);
            }
        }
        gameLauncher(1, getQuestion(), getResult());
    }
}
