package hexlet.code.games;

import static hexlet.code.Engine.*;
public class Even {
    public static void game() {
        for (int i = 0; i < roundsCount; i++) {
            int randomNumber = getRandomNumber(1, 100);
            question[i] = Integer.toString(randomNumber);
            result[i] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        gameLauncher(0, question, result);
    }
}