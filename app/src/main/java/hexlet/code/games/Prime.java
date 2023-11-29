package hexlet.code.games;

import static hexlet.code.Engine.*;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Prime {
    public static void game() {

        for (int i = 0; i < roundsCount; i++) {

            int randomNumber = getRandomNumber(NUMBERTOGENERATEARANDOMNUMBER1, NUMBERTOGENERATEARANDOMNUMBER100);
            question[i] = String.valueOf(randomNumber);

            if (randomNumber < 2) {
                result[i] = "no";
            }

            for (int j = 2; j <= randomNumber; j++) {
                if (randomNumber % j == 0 && randomNumber != j) {
                    result[i] = "no";
                    break;
                } else {
                    result[i] = "yes";
                }
            }
        }
        gameLauncher(4, question, result);
    }

    public static void main(String[] args) {
        game();
    }
}
