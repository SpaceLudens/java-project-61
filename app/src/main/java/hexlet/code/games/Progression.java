package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.RandomNumbers;


public class Progression {
public static final int STRINGLENGTH = 10;
    public static void game() {
        for (int i = 0; i < Engine.roundsCount; i++) {
            StringBuilder str = new StringBuilder();
            int firstRandomNumber = RandomNumbers.getRandomNumber(Engine.NUMBERTOGENERATEARANDOMNUMBER1, Engine.NUMBERTOGENERATEARANDOMNUMBER100);
            int stepBetweenNumbers = RandomNumbers.getRandomNumber(Engine.NUMBERTOGENERATEARANDOMNUMBER1, Engine.NUMBERTOGENERATEARANDOMNUMBER5);
            int randomSkippedNumber = RandomNumbers.getRandomNumber(0, Engine.NUMBERTOGENERATEARANDOMNUMBER10);

            for (int j = 0; j < STRINGLENGTH; j++) {
                if (j == randomSkippedNumber) {
                    Engine.result[i] = String.valueOf(firstRandomNumber + stepBetweenNumbers);
                    str.append(".." + " ");
                } else {
                    str.append(firstRandomNumber + stepBetweenNumbers).append(" ");
                }
                firstRandomNumber = firstRandomNumber + stepBetweenNumbers;
            }
            Engine.question[i] = str.toString();
        }
        Engine.gameLauncher(App.THIRDGAME, Engine.question, Engine.result);
    }
}
