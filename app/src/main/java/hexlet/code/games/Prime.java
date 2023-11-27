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

            for (int j = 2; j <= randomNumber; j++) {
                if (randomNumber % j == 0 && j != randomNumber) {
                    result[i] = "no";
                    break;
                } else if (randomNumber % j == 0 && j == randomNumber) {
                    result[i] = "yes";
                    break;
                }
            }
        }
        gameLauncher(4, question, result);
    }
}
