package hexlet.code.games;

import static hexlet.code.Engine.roundsCount;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Prime {
    public static void game() {

        String [] questions = new String[roundsCount];
        String [] answers = new String[roundsCount];

        for (int i = 0; i < roundsCount; i++) {
            int randomNumber = getRandomNumber(1, 100);
            questions[i] = String.valueOf(randomNumber);

            for (int j = 2; j <= randomNumber / 2; j++) {
                if (randomNumber % j == 0) {
                    answers[i] = "no";
                    break;
                } else {
                    answers[i] = "yes";
                }
            }
        }
        gameLauncher(4, questions, answers);
    }
}
