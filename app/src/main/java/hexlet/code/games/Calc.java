package hexlet.code.games;

import static hexlet.code.Engine.getRoundscount;
import static hexlet.code.Engine.NUMBERTOGENERATEARANDOMNUMBER1;
import static hexlet.code.Engine.NUMBERTOGENERATEARANDOMNUMBER4;
import static hexlet.code.Engine.NUMBERTOGENERATEARANDOMNUMBER100;
import static hexlet.code.Engine.getQuestion;
import static hexlet.code.Engine.getResult;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Calc {
    private static final int GAMEVAR1 = 1;
    private static final int GAMEVAR2 = 2;
    private static final int GAMEVAR3 = 3;
    public static void game() {
        for (int i = 0; i < getRoundscount(); i++) {
            int rand = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER4);
            int firstRandomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            int secondRandomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            if (rand == GAMEVAR1) {
                getQuestion()[i] = firstRandomNumber + " + " + secondRandomNumber;
                getResult()[i] = String.valueOf(firstRandomNumber + secondRandomNumber);
            } else if (rand == GAMEVAR2) {
                getQuestion()[i] = firstRandomNumber + " - " + secondRandomNumber;
                getResult()[i] = String.valueOf(firstRandomNumber - secondRandomNumber);
            } else if (rand == GAMEVAR3) {
                getQuestion()[i] = firstRandomNumber + " * " + secondRandomNumber;
                getResult()[i] = String.valueOf(firstRandomNumber * secondRandomNumber);
            }
        }
        gameLauncher(1, getQuestion(), getResult());
    }
}
