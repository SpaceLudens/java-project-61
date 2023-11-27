package hexlet.code.games;

import static hexlet.code.Engine.*;

public class Progression {

    public static void game() {
        for (int i = 0; i < roundsCount; i++) {

            StringBuilder str = new StringBuilder(" ");
            int firstRandomNumber = getRandomNumber(1, 100);
            int stepBetweenNumbers = getRandomNumber(1, 5);
            int randomSkippedNumber = getRandomNumber(0, 10);
            int StringLength = 10;

            for (int j = 0; j < StringLength; j++) {
                if (j == randomSkippedNumber) {
                    result[i] = String.valueOf(firstRandomNumber + stepBetweenNumbers);
                    str.append(".." + " ");
                } else {
                    str.append(firstRandomNumber + stepBetweenNumbers).append(" ");
                }
                firstRandomNumber = firstRandomNumber + stepBetweenNumbers;
            }
            question[i] = str.toString();
        }
        gameLauncher(3, question, result);
    }
}
