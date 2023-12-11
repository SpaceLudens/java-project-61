package hexlet.code.games;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;


public class Progression {
    private static final String GAME_RULE = "What number is missing in the progression?";

    private static String[] progression(int start, int step, int length) {
        var progression = new String[length];
        for (int i = 0; i < progression.length; i++) {
            int currentElement;
            currentElement = start + step;
            start = currentElement;
            progression[i] = String.valueOf(currentElement);
        }
        return progression;
    }

    public static void play() {
        final int randomMinValue1 = 1;
        final int randomMaxValue100 = 100;
        final int randomMaxValue9 = 9;
        final int randomMaxValue5 = 5;
        final int progressionLength = 10;
        String[][] questionsAndCorrectAnswers = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            int start = getRandomNumber(randomMinValue1, randomMaxValue100);
            int step = getRandomNumber(randomMinValue1, randomMaxValue5);
            int skippedIndex = getRandomNumber(0, randomMaxValue9);
            for (int j = 0; j < questionsAndCorrectAnswers[i].length - 1; j++) {
                String[] progression = (progression(start, step, progressionLength));
                String replacedItem = progression[skippedIndex];
                progression[skippedIndex] = "..";
                String alteredProgression = String.join(" ", progression);
                questionsAndCorrectAnswers[i][0] = alteredProgression;
                questionsAndCorrectAnswers[i][1] = replacedItem;
            }
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
