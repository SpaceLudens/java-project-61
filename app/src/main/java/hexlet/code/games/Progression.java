package hexlet.code.games;

import java.util.Arrays;
import static hexlet.code.Engine.*;

public class Progression {

    public static void game() {
        for (int i = 0; i < 3; i++) {
            String[] array = new String[10];
            int firstArrayNumber = getRandomNumber(1,100);
            int stepBetweenNumbers = getRandomNumber(1,5);
            int randomArrayIndex = getRandomNumber(0,array.length);

            for (int j = 0; j < array.length; j++) {
                array[j] = String.valueOf(firstArrayNumber + stepBetweenNumbers);
                firstArrayNumber = Integer.parseInt(array[j]);
                if (j == randomArrayIndex) {
                    result[i] = array[j];
                    array[j] = "..";
                }
            }
            question[i] = Arrays.toString(array);
        }
        gameLauncher(3, question, result);
    }
}
