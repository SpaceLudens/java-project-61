package hexlet.code.games;

import static hexlet.code.Engine.getQuestion;
import static hexlet.code.Engine.getResult;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.roundsCount;
import static hexlet.code.Engine.NUMBERTOGENERATEARANDOMNUMBER1;
import static hexlet.code.Engine.NUMBERTOGENERATEARANDOMNUMBER100;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Prime {
    public static void game() {

        for (int i = 0; i < roundsCount; i++) {

            int randomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            getQuestion()[i] = String.valueOf(randomNumber);

            if (randomNumber < 2) {
                getResult()[i] = "no";
            }

            for (int j = 2; j <= randomNumber; j++) {
                if (randomNumber % j == 0 && randomNumber != j) {
                    getResult()[i] = "no";
                    break;
                } else {
                    getResult()[i] = "yes";
                }
            }
        }
        gameLauncher(4, getQuestion(), getResult());
    }
}
