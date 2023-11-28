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
            switch (rand) {
                case (1): {
                    question[i] = firstRandomNumber + " + " + secondRandomNumber;
                    result[i] = String.valueOf(firstRandomNumber + secondRandomNumber);
                    break;
                }
                case (2): {
                    question[i] = firstRandomNumber + " - " + secondRandomNumber;
                    result[i] = String.valueOf(firstRandomNumber - secondRandomNumber);
                    break;
                }
                case (3): {
                    question[i] = firstRandomNumber + " * " + secondRandomNumber;
                    result[i] = String.valueOf(firstRandomNumber * secondRandomNumber);
                    break;
                }
                default: {

                }
            }
        }
        gameLauncher(1, question, result);
    }
}
