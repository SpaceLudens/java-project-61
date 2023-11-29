package hexlet.code.games;

import static hexlet.code.Engine.getQuestion;
import static hexlet.code.Engine.getResult;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.getRoundsCount;
import static hexlet.code.Engine.NUMBERTOGENERATEARANDOMNUMBER1;
import static hexlet.code.Engine.NUMBERTOGENERATEARANDOMNUMBER10;

import static hexlet.code.RandomNumbers.getRandomNumber;

public class Even {
    public static void game() {
        for (int i = 0; i < getRoundsCount(); i++) {
            int randomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER10);
            getQuestion()[i] = Integer.toString(randomNumber);
            getResult()[i] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        gameLauncher(0, getQuestion(), getResult());
    }
}
