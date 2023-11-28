package hexlet.code.games;

import static hexlet.code.Engine.question;
import static hexlet.code.Engine.roundsCount;
import static hexlet.code.Engine.result;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Calc {
    public static void game() {
        for (int i = 0; i < roundsCount; i++) {
            int rand = getRandomNumber(1, 4);
            int firstRandomNumber = getRandomNumber(1, 100);
            int secondRandomNumber = getRandomNumber(1, 100);
            if (rand == 1) {
                question[i] = firstRandomNumber + " + " + secondRandomNumber;
                result[i] = String.valueOf(firstRandomNumber + secondRandomNumber);
            } else if (rand == 2) {
                question[i] = firstRandomNumber + " - " + secondRandomNumber;
                result[i] = String.valueOf(firstRandomNumber - secondRandomNumber);
            } else if (rand == 3) {
                question[i] = firstRandomNumber + " * " + secondRandomNumber;
                result[i] = String.valueOf(firstRandomNumber * secondRandomNumber);
            }
        }
        gameLauncher(1, question, result);
    }
}
