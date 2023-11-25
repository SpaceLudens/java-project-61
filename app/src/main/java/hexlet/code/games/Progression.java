package hexlet.code.games;

import static hexlet.code.Engine.*;

public class Progression {

    public static void game() {
        for (int i = 0; i < 3; i++) {
            StringBuilder str = new StringBuilder(" ");
            int firstArrayNumber = getRandomNumber(1, 100);
            int stepBetweenNumbers = getRandomNumber(1, 5);
            int randomArrayIndex = getRandomNumber(0, 9);

            for (int j = 0; j < 9; j++) {
                if (j == randomArrayIndex) {
                    result[i] = String.valueOf(firstArrayNumber + stepBetweenNumbers);
                    str.append(".." + " ");
                    firstArrayNumber = firstArrayNumber + stepBetweenNumbers;
                } else {
                    str.append(firstArrayNumber + stepBetweenNumbers).append(" ");
                    firstArrayNumber = firstArrayNumber + stepBetweenNumbers;
                }
            }
            question[i] = str.toString();
        }
        gameLauncher(3, question, result);
    }

    public static void main(String[] args) {
        game();
    }
}
