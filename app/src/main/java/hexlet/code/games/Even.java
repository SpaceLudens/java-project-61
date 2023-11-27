package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.roundsCount;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Even {
    public static void game() {
        for (int i = 0; i < roundsCount; i++) {
            int randomNumber = getRandomNumber(1, 100);
            Engine.question[i] = Integer.toString(randomNumber);
            Engine.result[i] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        gameLauncher(0, Engine.question, Engine.result);
    }
}
