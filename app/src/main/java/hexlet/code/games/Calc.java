package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.RandomNumbers.getRandomNumber;

public class Calc {
    private static final String GAME_RULE = "What is the result of the expression?";
    public static char generateRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = getRandomNumber(0, operators.length);
        return operators[randomIndex];
    }
    public static int calculateExpression(int num1, int num2, char operator) {
        int result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result =  num1 - num2;
        } else if (operator == '*') {
            result =  num1 * num2;
        }
        return result;
    }
    public static void game() {
        final int ARRAYS_COUNT = 3;
        final int ARRAYS_LENGTH  = 2;
        final int RANDOM_MIN_VALUE_1 = 1;
        final int RANDOM_MAX_VALUE_100 = 100;
        String[][] questionsAndCorrectAnswers = new String[ARRAYS_COUNT][ARRAYS_LENGTH];
        for (int i = 0; i < questionsAndCorrectAnswers.length; i++) {
            int firstRandomNumber = getRandomNumber(RANDOM_MIN_VALUE_1, RANDOM_MAX_VALUE_100);
            int secondRandomNumber = getRandomNumber(RANDOM_MIN_VALUE_1, RANDOM_MAX_VALUE_100);
            char randomOperator = generateRandomOperator();
            int expressionResult = calculateExpression(firstRandomNumber, secondRandomNumber, randomOperator);
            for (int j = 0; j < questionsAndCorrectAnswers.length - 2; j++) {
                questionsAndCorrectAnswers[i][j] = firstRandomNumber + " " + randomOperator + " " + secondRandomNumber;
                questionsAndCorrectAnswers[i][j + 1] = String.valueOf(expressionResult);
            }
        }
        gameLauncher(GAME_RULE, questionsAndCorrectAnswers);
    }
}
