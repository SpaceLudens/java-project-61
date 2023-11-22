
package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.question;
import static hexlet.code.Engine.userAnswer;

public class Even {
    public static void game() {
        for (int i = 0; i < 3; i++) {
            int randomNumber = Engine.getRandomNumber(1, 100);
            question[i] = Integer.toString(randomNumber);
            userAnswer[i] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        Engine.gameLauncher(0, question, userAnswer);
    }

}