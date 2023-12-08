package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Progression {
    private static final String GAME_RULE = "What number is missing in the progression?";
    public static String[] progression (int start, int step, int length) {
        var progression = new String[length];
        for (int i = 0; i < progression.length; i++) {
            int currentElement;
            currentElement = start + step;
            start = currentElement;
            progression[i] = String.valueOf(currentElement);
        }
        return progression;
    }
    public static void game() {
        String[][] questionsAndCorrectAnswers = new String[3][2];
        int startRandom_1 = 1;
        int endRandom_100 = 100;
        int endRandom_9 = 9;
        int endRandom_5 = 5;
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            int start = getRandomNumber(startRandom_1, endRandom_100);
            int step = getRandomNumber(startRandom_1, endRandom_5);
            int skippedIndex = getRandomNumber(0, endRandom_9);
            String question = "";
            String answer = "";
            for (int j = 0; j < questionsAndCorrectAnswers[i].length - 1; j++) {
                var progression = (progression(start, step, 10));
                for (int k = 0; k < progression.length; k++) {
                    if(k == skippedIndex) {
                        answer = progression[k];
                        question += ".. ";
                        continue;
                    }
                    question += progression[k] + " ";
                }
                questionsAndCorrectAnswers[i][j] = question;
                questionsAndCorrectAnswers[i][j + 1] = answer;
            }
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
