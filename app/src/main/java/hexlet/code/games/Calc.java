package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Calc {
    private static final String GAME_RULE = "What is the result of the expression?";
    private static final int ARRAYS_COUNT = 3;
    private static final int ARRAYS_LENGTH = 2;

    private static char generateRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = getRandomNumber(0, operators.length);
        return operators[randomIndex];
    }

    private static int calculateExpression(int num1, int num2, char operator) {
        int result;
        result = switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> 0;
        };
        return result;
    }

    public static void play() {
        final int randomMinValue1 = 1;
        final int randomMaxValue100 = 100;
        String[][] questionsAndCorrectAnswers = new String[ARRAYS_COUNT][ARRAYS_LENGTH];
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            int firstRandomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
            int secondRandomNumber = getRandomNumber(randomMinValue1, randomMaxValue100);
            char randomOperator = generateRandomOperator();
            int expressionResult = calculateExpression(firstRandomNumber, secondRandomNumber, randomOperator);
            questionsAndCorrectAnswers[i][0] = firstRandomNumber + " " + randomOperator + " " + secondRandomNumber;
            questionsAndCorrectAnswers[i][1] = String.valueOf(expressionResult);
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
