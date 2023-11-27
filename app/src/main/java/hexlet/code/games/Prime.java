package hexlet.code.games;

import static hexlet.code.Engine.question;
import static hexlet.code.Engine.roundsCount;
import static hexlet.code.Engine.result;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Prime {
    public static void game() {

        for (int i = 0; i < roundsCount; i++) {

            int randomNumber = getRandomNumber(1, 100);
            question[i] = String.valueOf(randomNumber);

            for (int j = 2; j <= randomNumber / 2; j++) {
                if (randomNumber % j == 0) {
                    result[i] = "no";
                    break;
                } else {
                    result[i] = "yes";
                }
            }
        }
        gameLauncher(4, question, result);
    }
}
