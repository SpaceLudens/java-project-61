package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;


public class Progression {
    private static final String GAME_RULE = "What number is missing in the progression?";
    private static final int ARRAYS_COUNT = 3;
    private static final int ARRAYS_LENGTH = 2;

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

    private static String replacingAnElementInAProgression(String[] array, int index) {
        StringBuilder alteredProgression = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                alteredProgression.append(".. ");
                continue;
            }
            alteredProgression.append(array[i]).append(" ");
        }
        return alteredProgression.toString();
    }

    private static String getTheReplacedItem(String[] array, int index) {
        String replacedItem = "";
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                replacedItem = array[i];
            }
        }
        return replacedItem;
    }

    public static void play() {
        final int randomMinValue1 = 1;
        final int randomMaxValue100 = 100;
        final int randomMaxValue9 = 9;
        final int randomMaxValue5 = 5;
        final int progressionLength = 10;
        String[][] questionsAndCorrectAnswers = new String[ARRAYS_COUNT][ARRAYS_LENGTH];
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            int start = getRandomNumber(randomMinValue1, randomMaxValue100);
            int step = getRandomNumber(randomMinValue1, randomMaxValue5);
            int skippedIndex = getRandomNumber(0, randomMaxValue9);
            for (int j = 0; j < questionsAndCorrectAnswers[i].length - 1; j++) {
                String[] progression = (progression(start, step, progressionLength));
                String replacedItem = getTheReplacedItem(progression, skippedIndex);
                String alteredProgression = replacingAnElementInAProgression(progression, skippedIndex);
                questionsAndCorrectAnswers[i][0] = alteredProgression;
                questionsAndCorrectAnswers[i][1] = replacedItem;
            }
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
