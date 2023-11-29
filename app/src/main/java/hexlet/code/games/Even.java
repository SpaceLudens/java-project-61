package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.*;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Even {
    public static void game() {
        for (int i = 0; i < roundsCount; i++) {
            int randomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER10);
            Engine.getQuestion()[i] = Integer.toString(randomNumber);
            Engine.getResult()[i] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        gameLauncher(0, getQuestion(), getResult());
    }
}
